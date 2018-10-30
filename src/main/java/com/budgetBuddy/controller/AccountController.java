package com.budgetBuddy.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.budgetBuddy.entities.Account;
import com.budgetBuddy.entities.AccountCredentials;
import com.budgetBuddy.tools.QuickBudget;
import com.budgetBuddy.tools.QuickBudgetResult;
import com.budgetBuddy.DAO.AccountDA;


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
		model.addAttribute("newCredentials", new AccountCredentials());
		
		return "sign-up";
	}
	@RequestMapping("/new-account-confirmation")
	public String showAccountConfirmationResult(Model model,@Valid @ModelAttribute("newAccount") Account newAccount,
			BindingResult bindingResult) {
		
		AccountDA.addAccount(newAccount);
		return "new-account-confirmation";
	}
}
