package com.budgetBuddy.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AccountController {
	@RequestMapping(value ="/account", method =RequestMethod.GET)
	public String showAccount() {
		return "account";
	}
	

}
