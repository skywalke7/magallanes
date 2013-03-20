package com.kuku.administrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kuku.administrator.form.UserForm;
import com.kuku.administrator.services.UserService;

@Controller
public class RegisterController {
	
	// Service injection
	@Autowired
	UserService userService;
	
	/**
	 * 	Method to redirect to register page
	 * 
	 *  @param model Anotation for setting the object to Form
	 *  @param LoginForm Object linked to Form view
	 *  @return A String that especifies the view to resolve
	 *  
	 * **/
	
	@RequestMapping(value="/register",method= RequestMethod.GET)
	public String showRegisterForm(@ModelAttribute("userForm") UserForm userForm){
		
		return "register";
		
	}
	
	/**
	 * 	Redirect to a page after saving the user record
	 * 
	 *  @param model Anotation for setting the object to Form
	 *  @param LoginForm Object@RequestMapping(value="/register",method= RequestMethod.POST)
	 *  @return A String that especifies the view to resolve
	 *  
	 * **/
	
	@RequestMapping(value="/register",method= RequestMethod.POST)
	public String saveRegisterUser(@ModelAttribute("userForm") UserForm userForm){
		
		System.out.println("puto nombre --> " + userForm.getName());
		
		return "redirect:/";
		
	}

}
