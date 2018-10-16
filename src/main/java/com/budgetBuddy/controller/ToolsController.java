package com.budgetBuddy.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	@RequestMapping("/compound-interest-calculator")
	public String showCompoundInterestCalculator(Model model) {
		model.addAttribute("interest", new CompoundInterest());
		return "compound-interest";
	}
	
	@RequestMapping("/compound-interest-result")
	public String showCompoundInterestResult(Model model, 
			@Valid @ModelAttribute("interest") CompoundInterest interest,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) 
			return "compound-interest";
		
		CompoundInterestResult interestResult = new CompoundInterestResult(interest);
		model.addAttribute("interestResult", interestResult);
		return "compound-interest-result";
	}
	
	
	@RequestMapping("/budgetCalculator")
	public String showBudgetCalculator(Model model) {
		model.addAttribute("budget", new QuickBudget());
		return "budget";
	}
	
	@RequestMapping("/budget/result")
		public String showBudgetCalculatorResult(Model model, @ModelAttribute("budget") QuickBudget budget) {
		model.addAttribute("budgetResult", new QuickBudgetResult(budget));
		return "budgetResult";
	}
	
	
	@RequestMapping("/401k")
	public String show401kCalculator(Model model) {
		model.addAttribute("account", new Quick401k());
		return "401k";
	}
	
	@RequestMapping("/401kResult")

		public String show401kResult(Model model, @ModelAttribute("account") Quick401k account) {
			model.addAttribute("NestEggResult", new Quick401kResult(account));
			return "401kResult";
		}
	

}


