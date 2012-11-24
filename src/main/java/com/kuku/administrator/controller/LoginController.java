package com.kuku.administrator.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value="/",method= RequestMethod.GET)
	public String showLogin(Model model){
		
		model.addAttribute("loginForm",new LoginForm());
		
		return "login";
		
	}
	
	@RequestMapping(value="/",method= RequestMethod.POST)
	public String validateLogin(@Valid LoginForm loginForm,BindingResult result, HttpServletRequest request) {
        
		System.out.println("RESULT --> " + result);
		
		if (result.hasErrors()) {
            return "login";
        }
		
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
