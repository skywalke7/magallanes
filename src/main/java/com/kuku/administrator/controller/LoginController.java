package com.kuku.administrator.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
	
	protected final Log logger = LogFactory.getLog(getClass());

	/**
	 * 	Method to redirect to login page
	 * 
	 *  @param model Anotation for setting the object to Form
	 *  @param LoginForm Object linked to Form view
	 *  @return A String that especifies the view to resolve
	 *  
	 * **/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLogin(@ModelAttribute("loginForm") LoginForm loginForm,HttpServletRequest request) {
		
		System.out.println("PASA POR AQUI");
		
		return "init";

	}
	
	/**
	 * 	Method to validate the login form data
	 * 
	 *  @return A String that especifies the action to validate the data form
	 *  
	 * **/

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String validateLogin() {


		return "forward:j_spring_security_check";

	}
	
	/**
	 * 	Method to redirect to the home page after a successful last logged
	 * 
	 *  @return A String that especifies the view to resolve
	 *  
	 * **/
	
	@RequestMapping(value="/home",method= RequestMethod.GET)
	public String showHome(){
		
		return "home";
		
	}	
		
}
