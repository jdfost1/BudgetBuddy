package com.budgetBuddy.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.budgetBuddy.tools.CompoundInterest;
import com.budgetBuddy.tools.CompoundInterestResult;
import com.budgetBuddy.tools.Quick401k;
import com.budgetBuddy.tools.Quick401kResult;
import com.budgetBuddy.tools.QuickBudget;
import com.budgetBuddy.tools.QuickBudgetResult;

@Controller
@RequestMapping("/tools")
public class ToolsController {
	
	@GetMapping("/compound-interest-calculator")
	public String showCompoundInterestCalculator(Model model) {
		model.addAttribute("compoundInterest", new CompoundInterest());
		return "compound-interest";
	}
	
	@PostMapping("/compound-interest-calculator")
	public String showCompoundInterestResult(Model model, 
			@Valid @ModelAttribute("compoundInterest") CompoundInterest interest,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) 
			return "compound-interest";
		
		CompoundInterestResult interestResult = new CompoundInterestResult(interest);
		model.addAttribute("compoundInterestResult", interestResult);
		return "compound-interest-result";
	}
	
	@GetMapping("/quick-budget")
	public String showBudgetCalculator(Model model) {
		model.addAttribute("budget", new QuickBudget());
		return "quick-budget";
	}
	
	@PostMapping("/quick-budget")
	public String showBudgetCalculatorResult(Model model, @Valid @ModelAttribute("budget") QuickBudget budget,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) 
			return "quick-budget";
		
		model.addAttribute("budgetResult", new QuickBudgetResult(budget));
		return "quick-budget-result";
	}
	
	@GetMapping("/401k-calculator")
	public String show401kCalculator(Model model) {
		model.addAttribute("account", new Quick401k());
		return "401k";
	}
	
	@PostMapping("/401k-calculator")
	public String show401kResult(Model model, @Valid @ModelAttribute("account") Quick401k account,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "401k";
		model.addAttribute("NestEggResult", new Quick401kResult(account));
		return "401k-result";
	}
}


