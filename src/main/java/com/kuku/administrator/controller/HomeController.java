package com.kuku.administrator.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	/**
	 * 	Method to redirect to the home page after a successful last logged
	 * 
	 *  @return A String that especifies the view to resolve
	 *  
	 * **/
	
	@RequestMapping(value="/home",method= RequestMethod.GET)
	 public String showHome(ModelMap model){
	                               
		 //System.out.println("---> " + SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
		 UserDetails user =  (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		 model.addAttribute("username",user.getUsername());
		               
		 return "home";
	 }
	
}
