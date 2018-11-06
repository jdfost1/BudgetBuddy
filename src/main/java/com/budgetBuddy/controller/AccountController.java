package com.budgetBuddy.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.budgetBuddy.entities.User;
import com.budgetBuddy.model.UserRegistration;
import com.budgetBuddy.service.UserService;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private UserService userService;
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@GetMapping("/")
	public String showAccountPage() {
		return "account";
	}
	
	@RequestMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	
	@GetMapping("/sign-up")
	public String showSignUpPage(Model model) {
		model.addAttribute("userRegistration", new UserRegistration());
		return "sign-up";
	}
	
	@PostMapping("/sign-up")
	public String processSignUp(@Valid @ModelAttribute("userRegistration") UserRegistration registration,
			BindingResult bindingResult, Model model) {
		// If the form is not filled out properly, show the errors on the form
		if (bindingResult.hasErrors()) {
			return "sign-up";
		}
		
		// Check if the user already exists in the database
		User existing = userService.findByEmail(registration.getEmail());
		if (existing != null) {
			model.addAttribute("userRegistration", new UserRegistration());
			model.addAttribute("registrationError", "A user with that email already exists.");
			return "sign-up";
		}
		
		// Save user in the database
		userService.save(registration);
		
		// Bring the user to the home page
		return "redirect:/";
	}
}
