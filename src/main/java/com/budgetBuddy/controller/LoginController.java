package com.budgetBuddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.budgetBuddy.entities.Account;
import com.budgetBuddy.entities.Users;
import com.budgetBuddy.form.LoginForm;
import com.budgetBuddy.service.LoginService;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;
import javax.validation.Valid;
@Controller
@RequestMapping("/account/login")
public class LoginController {

	
	@Autowired
	public LoginService loginService;

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Model model) {

		model.addAttribute("loginForm", new Users());
		
		return "login";
	}

	@RequestMapping(value="/loginValidate",method=RequestMethod.POST)
	public String processForm(Model model,@Valid @ModelAttribute("loginForm") Users loginForm, BindingResult result
			) {
		System.out.println("user:"+ loginForm.getUserName());

	//pass username and password to check login to check database
		boolean userExists = loginService.checkLogin(loginForm.getUserName(),
                loginForm.getPassword());
		if(userExists){
//			model.put("loginForm", loginForm);
			return "loginsuccess";
		}else{
			result.rejectValue("userName","invaliduser");
			return "loginform";
		}

	}

}
