package com.budgetBuddy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.budgetBuddy.entities.Budget;
import com.budgetBuddy.entities.User;
import com.budgetBuddy.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String showHomePage(Model model) {
		String email = SecurityContextHolder.getContext().getAuthentication().getName();
		if (email.contains("@")) {
			User user = userService.findByEmail(email);
			if (user != null) {
				Budget budget = user.getBudget();
				model.addAttribute("budget", budget);
			}
		}
		return "index";
	}
}
