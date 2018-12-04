package com.budgetBuddy.controller;

import java.util.Date;

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
import org.springframework.web.bind.annotation.SessionAttributes;

import com.budgetBuddy.entities.Budget;
import com.budgetBuddy.entities.BudgetAdvice;
import com.budgetBuddy.entities.SavingsTarget;
import com.budgetBuddy.entities.SuggestedBudget;
import com.budgetBuddy.entities.User;
import com.budgetBuddy.model.BudgetForm;
import com.budgetBuddy.service.UserService;

@Controller
@SessionAttributes("budgetForm")
@RequestMapping("/budget")
public class BudgetController {
	
	@Autowired
	private UserService userService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@GetMapping
	public String showBudget(Model model) {
		//authenticate and get users email to search for user's info in db tables
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		//Retrieve the user's budget
		User user = userService.findByEmail(email);
		Budget budget = user.getBudget();
		if (budget == null)
			return "redirect:/budget/create?notCreated";
		
		//Retrieve user's info from the suggested_budget,savings_target, and budget_advice tables in the database
		SuggestedBudget suggestedBudget = user.getSuggestedBudget();
		SavingsTarget savingsTarget = user.getSavingsTarget();
		BudgetAdvice budgetAdvice = user.getBudgetAdvice();
		
		//get days left to hit savings goal by getting current date and end date
		savingsTarget.setDaysLeft(SavingsTarget.calculateDaysRemaining(savingsTarget.getEndDate()));
	
		// Add budget,suggestedBudget, and budgetAdvice objects to the model
		model.addAttribute("budget", budget);
		model.addAttribute("suggestedBudget", suggestedBudget);
		model.addAttribute("savingsTarget", savingsTarget);
		model.addAttribute("budgetAdvice",budgetAdvice);
		return "account";
	}
	
	@GetMapping("/create")
	public String showBudgetForm(Model model) {
		// create budgetForm object and set to model
		model.addAttribute("budgetForm", new BudgetForm());
		return "budget-form";
	}
	
	@PostMapping("/create/savings-target")
	public String showSavingsTargetPlanOptions(@Valid @ModelAttribute("budgetForm") BudgetForm budgetForm,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors())
			return "budget-form";
		
		// create new savings target object
		SavingsTarget savingsTarget = new SavingsTarget();

		// calculate user's savings target options using the info from budget form
		savingsTarget.calculateSavingsTargetOptions(budgetForm);

		// after calculating, set savings target object with calculated values to model
		model.addAttribute("savingsTarget", savingsTarget);
		
		return "savings-target-options";
	}
	
	@PostMapping("/create/complete")
	public String completeBudget(@ModelAttribute("SavingsTarget") SavingsTarget savingsTarget, BindingResult result,
			@ModelAttribute("budgetForm") BudgetForm budgetForm, BindingResult bindingResult, Model model) {

		// pass savings target info and budgetForm info into Budget constructor to calculate budget
		Budget budget = new Budget();
		budget.createBudget(savingsTarget, budgetForm);
		
		//calculate user's suggested budget with just their income
		SuggestedBudget suggestedBudget = new SuggestedBudget();
		suggestedBudget.calculateSuggestedBudget(budgetForm.getIncome());
		
		//calculate user's budget advice info by comparing their current budget with suggested budget
		BudgetAdvice budgetAdvice = new BudgetAdvice();
		budgetAdvice.generateBudgetAdvice(budget, suggestedBudget);
		
		//calculate end date and days left for savings target
		savingsTarget.setStartDate(new Date());
		savingsTarget.setEndDate(SavingsTarget.calculateEndDate((int)savingsTarget.getSavingsTargetMonths()));
		savingsTarget.setDaysLeft(SavingsTarget.calculateDaysRemaining(savingsTarget.getEndDate()));
		savingsTarget.calculateSavingsTargetOptions(budgetForm);
		

		// set the new calculated budget to the model
		model.addAttribute("budget", budget);
		model.addAttribute("suggestedBudget",suggestedBudget);
		model.addAttribute("savingsTarget",savingsTarget);
		model.addAttribute("budgetAdvice");
		
		// Retrieve the user, set their budget,suggestedBudget,savingsTarget,and budgetAdvice.. then save user to database
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userService.findByEmail(email);
		user.setBudget(budget);
		user.setSuggestedBudget(suggestedBudget);
		user.setSavingsTarget(savingsTarget);
		user.setBudgetAdvice(budgetAdvice);
		userService.save(user);
		
		return "redirect:/budget";
	}
}
