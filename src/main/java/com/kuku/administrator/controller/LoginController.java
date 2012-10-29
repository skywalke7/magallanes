package com.kuku.administrator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kuku.administrator.form.LoginForm;

@Controller
public class LoginController {
	
	@RequestMapping(value ="/login",method= RequestMethod.GET)
	public String authenticationFailed(Model model){
		
		model.addAttribute("loginForm", new LoginForm());
		System.out.println("AQUI ENTRA SI LA AUTENTICACION ES FALLIDA");
		
		return "login";
		
	}
	
	@RequestMapping(value="/",method= RequestMethod.GET)
	public String showLogin(Model model){
		
		model.addAttribute("loginForm",new LoginForm());
		System.out.println("NO MAMES VAYAAA!");
		
		return "login";
		
	}
	
	@RequestMapping(value="/",method= RequestMethod.POST)
	public String validateLogin(){
		
		System.out.println("POR METODO POST");
		return "forward:j_spring_security_check";
		
	}
	
}
