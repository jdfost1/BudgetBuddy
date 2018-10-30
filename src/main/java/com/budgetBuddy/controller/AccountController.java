package com.budgetBuddy.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.budgetBuddy.entities.Account;
import com.budgetBuddy.tools.QuickBudget;
import com.budgetBuddy.tools.QuickBudgetResult;


@Controller
@RequestMapping("/account")
public class AccountController {
	
	@RequestMapping("")
	public String showAccount() {
		return "account";
	}
	
	@RequestMapping("/login")
	 public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }
	
	@RequestMapping("/sign-up")
	public String signUp(Model model) {
		
		model.addAttribute("newAccount", new Account());
		return "sign-up";
	}
	@RequestMapping("/new-account-confirmation")
	public String showBudgetCalculatorResult(Model model, @Valid @ModelAttribute("newAccount") Account newAccount,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) 
			return "quick-budget";
		model.addAttribute("budgetResult", new QuickBudgetResult(budget));
		return "new-account-confirmation";
	}
}
