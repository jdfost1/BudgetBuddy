package com.budgetBuddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
	
@RequestMapping("/account")
public String account(Model model) {
	model.addAttribute("firstName", "Josh");
	model.addAttribute("lastName", "Foster");
	model.addAttribute("age", "27");
	return "account";
}


}
