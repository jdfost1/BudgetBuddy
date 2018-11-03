package com.budgetBuddy.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.budgetBuddy.entities.Users;
import com.budgetBuddy.service.LoginService;

@Controller
@RequestMapping("/account/login")
public class LoginController {

	//@Autowired
	public LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Model model) {

		model.addAttribute("loginForm", new Users());

		return "login";
	}//end of login mapping

	@RequestMapping(value = "/loginValidate", method = RequestMethod.POST)
	public String validateLogin(Model model, @Valid @ModelAttribute("loginForm") Users loginForm, BindingResult result) {
		System.out.println("user:" + loginForm.getUserName());

		// pass username and password to check login to check database
		boolean userExists = loginService.checkLogin(loginForm.getUserName(), loginForm.getPassword());
		if (userExists) {
//			model.put("loginForm", loginForm);
			return "accountPage";
		} else {
			result.rejectValue("userName", "invaliduser");
			return "login";
		}//end of else

	}//end of validate login

}
