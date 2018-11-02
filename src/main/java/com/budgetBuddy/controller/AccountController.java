package com.budgetBuddy.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.budgetBuddy.entities.Account;
import com.budgetBuddy.entities.Users;
import com.budgetBuddy.DAO.AccountDA;


@Controller
@RequestMapping("/account")
public class AccountController {
	
	@RequestMapping("")
	public String showAccount() {
		return "account";
	}
	
	
	@RequestMapping("/sign-up")
	public String signUp(Model model) {
		
		model.addAttribute("newAccount", new Account());
		
		
		return "sign-up";
	}
	@RequestMapping("/new-account-confirmation")
	public String showAccountConfirmationResult(Model model,@Valid @ModelAttribute("newAccount") Account newAccount,
			BindingResult bindingResult) {
		
		AccountDA.addAccount(newAccount);
		Users accountCredentials = new Users();
		
		accountCredentials.setPassword(newAccount.getPassword());
		accountCredentials.setUserName(newAccount.getEmail());
		
		AccountDA.addLogin(accountCredentials);
		
		return "new-account-confirmation";
	}
}
