package com.budgetBuddy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.budgetBuddy.entities.Budget;
import com.budgetBuddy.entities.User;
import com.budgetBuddy.model.BudgetForm;
import com.budgetBuddy.model.SavingsTarget;
import com.budgetBuddy.service.UserService;

@Controller
@SessionAttributes("budgetForm")//need budget form to hold data for entire session
@RequestMapping("/budget")
public class BudgetController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public String showBudget(Model model) {
		//Retrieve the current user's budget
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userService.findByEmail(email);
		Budget budget = user.getBudget();
	
		// Add budget object to the model
		model.addAttribute("newBudget", budget);
		
		return "account";
	}
	
	// show user budget form to start creating a budget
	@GetMapping("/budget-form")
	public String showBudgetForm(Model model) {
		// create budgetForm object and set to model
		model.addAttribute("budgetForm", new BudgetForm());
		return "budget-form";
	}
	
	//after submitting budget form, show user their savings target plan options
	@RequestMapping("/budget-form-complete")
	public String showSavingsTargetPlanOptions(@ModelAttribute("budgetForm") BudgetForm budgetForm,
			BindingResult bindingResult, Model model) {
		// create new savings target object
		SavingsTarget savingsTarget = new SavingsTarget();

		// pass user's budgetForm data into savings target calculator method
		savingsTarget.calculateSavingsTargetOptions(budgetForm);

		// after calculating, set savings target object with calculated values to model
		model.addAttribute("savingsTarget", savingsTarget);
		
		return "savings-target-options";
	}
	
	//after choosing savings target plan, calculate users budget and return to account page
	@RequestMapping("/completeBudget")
	public String completeBudget(@ModelAttribute("SavingsTarget") SavingsTarget savingsTarget, BindingResult result,
			@ModelAttribute("budgetForm") BudgetForm budgetForm, BindingResult bindingResult, Model model) {

		// pass savings target info and budgetForm info into Budget constructor to calculate budget
		Budget newBudget = new Budget();
		newBudget.createBudget(savingsTarget, budgetForm);

		// set the new calculated budget to the model
		model.addAttribute("newBudget", newBudget);
		
		// Retrieve the user, set their budget, and save to database
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userService.findByEmail(email);
		user.setBudget(newBudget);
		userService.save(user);
		
		return "account";
	}
}
