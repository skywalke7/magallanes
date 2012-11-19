package com.kuku.administrator.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kuku.administrator.form.LoginForm;
import com.kuku.administrator.form.UserForm;
import com.kuku.administrator.services.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;

	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value ="/login",method= RequestMethod.GET)
	public String authenticationFailed(Model model){
		
		model.addAttribute("loginForm", new LoginForm());
		
		logger.error("Form reloaded because a failed authentication");
		
		return "login";
		
	}

	
	@RequestMapping(value="/",method= RequestMethod.GET)
	public String showLogin(Model model){
		
		model.addAttribute("loginForm", new LoginForm());
		
		logger.info("Login form getting loaded");
		
		return "login";
		
	}
	
	@RequestMapping(value="/",method= RequestMethod.POST)
	public String validateLogin(@Valid LoginForm loginForm,BindingResult result, HttpServletRequest request) {
        
		if (result.hasErrors()) {
            return "login";
        }
		

		logger.info("Submiting info for validation against the database");

		return "forward:j_spring_security_check";
		
	}
	
	@RequestMapping(value="/home",method= RequestMethod.GET)
	public String showHome(){
		
		System.out.println("DENTRO DE HOME");
		
		return "home";
		
	}
	
	@RequestMapping(value="/register",method= RequestMethod.GET)
	public String showRegisterForm(Model model){
		
		model.addAttribute("registerForm", new UserForm());
		
		System.out.println("DENTRO DE REGISTER");
		
		return "register";
		
	}
	
	@RequestMapping(value="/register",method= RequestMethod.POST)
	public String showRegisterForm(@ModelAttribute("userForm") UserForm userForm){
		
		userService.userRegister(userForm);
		
		return "redirect:/";
		
	}
		
}
