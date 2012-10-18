package com.kuku.administrator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kuku.administrator.form.LoginForm;

@Controller
public class LoginController {
	
	@RequestMapping(value="/",method= RequestMethod.GET)
	public String showLogin(Model model){
		
		model.addAttribute("loginForm",new LoginForm());
		System.out.println("NO MAMES VAYAAA!");
		
		return "login";
		
	}

}
