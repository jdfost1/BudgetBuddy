package com.budgetBuddy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.budgetBuddy.DAO.BudgetDAO;
import com.budgetBuddy.DAO.BudgetDAOImpl;
import com.budgetBuddy.entities.Budget;
import com.budgetBuddy.entities.User;
import com.budgetBuddy.model.BudgetForm;
import com.budgetBuddy.model.UserDelete;
import com.budgetBuddy.model.UserRegistration;
import com.budgetBuddy.model.UserUpdate;
import com.budgetBuddy.service.UserService;
import com.budgetBuddy.model.SavingsTarget;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private UserService userService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@GetMapping
	public String showAccountPage() {
		return "account";
	}

	@RequestMapping("/login")
	public String showLoginPage() {
		return "login";
	}

	@GetMapping("/sign-up")
	public String showSignUpPage(Model model) {
		model.addAttribute("userRegistration", new UserRegistration());
		return "sign-up";
	}

	@PostMapping("/sign-up")
	public String processSignUp(@Valid @ModelAttribute("userRegistration") UserRegistration registration,
			BindingResult bindingResult, Model model) {
		// If the form is not filled out properly, show the errors on the form
		if (bindingResult.hasErrors()) {
			return "sign-up";
		}

		// Check if the user already exists in the database
		User existing = userService.findByEmail(registration.getEmail());
		if (existing != null) {
			model.addAttribute("userRegistration", new UserRegistration());
			model.addAttribute("registrationError", "A user with that email already exists.");
			return "sign-up";
		}

		// Save user in the database
		userService.save(registration);

		model.addAttribute("budgetForm", new BudgetForm());
		// Bring the user to create budget page
		return "budget-form";
	}

	@GetMapping("/budget-form")
	public String showBudgetForm(Model model) {
		model.addAttribute("budgetForm", new BudgetForm());
		return "budget-form";
	}

	@RequestMapping("/budget-form-complete")
	public String calculateBudget(@ModelAttribute("budgetForm") BudgetForm budgetForm, BindingResult bindingResult,
			Model model) {
		SavingsTarget savingsTimeline = new SavingsTarget();

		savingsTimeline.calculateSavingsTargetOptions(budgetForm);
		
		//calculate budget and set budget model
				
		model.addAttribute("Timeline", savingsTimeline);
		return "savings-target-options";
	}
	@RequestMapping("/completeBudget")
	public String completeBudget(@ModelAttribute("Timeline") SavingsTarget timeline, @ModelAttribute("budgetForm") BudgetForm budget, BindingResult bindingResult,
			Model model) {
		
		
		
				
				
				
				model.addAttribute("newBudget", new Budget(timeline,budget));
				
				Budget newBudget = new Budget(timeline,budget);
				
				
				//save budget to database
				//CurrentBudgetDAO.addCurrentBudget(newBudget);
		return "account";
	}

	@GetMapping("/update")
	public String showUpdateAccountPage(Model model) {
		// Get email of current user
		String email = SecurityContextHolder.getContext().getAuthentication().getName();

		// Retrieve account object
		User user = userService.findByEmail(email);

		// Create UserUpdate object
		UserUpdate update = new UserUpdate();
		update.setEmail(user.getEmail());
		update.setName(user.getName());
		update.setAge(user.getAge());

		// Add UserUpdate object to the model
		model.addAttribute("userUpdate", update);

		return "update-account";
	}

	@PostMapping("/update")
	public String processUpdateAccount(@Valid @ModelAttribute("userUpdate") UserUpdate update,
			BindingResult bindingResult, Model model) {
		boolean emailChanged = false;

		// Get the current user
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		User currentUser = userService.findByEmail(email);

		// If the form is not filled out properly, show the errors on the form
		if (bindingResult.hasErrors()) {
			return "update-account";
		}

		// Check if the user already exists in the database
		if (!update.getEmail().equals(email)) {
			User existing = userService.findByEmail(update.getEmail());
			if (existing != null) {
				model.addAttribute("registrationError", "A user with that email already exists.");
				return "update-account";
			}
			emailChanged = true;
		}

		// Save user in the database
		userService.save(currentUser, update);

		// If email address was changed, user must be forced to log in using the new
		// address
		if (emailChanged) {
			SecurityContextHolder.clearContext();
			return "redirect:/account/login?emailUpdated";
		}

		// Bring the user to the account page
		return "redirect:/account?updated";
	}

	@GetMapping("/delete")
	public String showDeleteAccountPage(Model model) {
		model.addAttribute("userDelete", new UserDelete());
		return "delete-account";
	}

	@PostMapping("/delete")
	public String processDeleteAccount(@Valid @ModelAttribute("userDelete") UserDelete delete,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "delete-account";
		}

		// Get the current user
		String email = SecurityContextHolder.getContext().getAuthentication().getName();

		// Check if emails match
		if (!delete.getEmail().equals(email)) {
			model.addAttribute("emailMismatch", true);
			return "delete-account";
		}

		// Retrieve the current user
		User currentUser = userService.findByEmail(email);

		// Delete the user
		userService.delete(currentUser);

		// Redirect user to the login page with a success message
		return "redirect:/account/login?accountDeleted";
	}
}
