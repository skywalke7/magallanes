package com.kuku.administrator.controller;

import static com.kuku.administrator.util.Constants.EMAIL;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.annotations.Parameter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kuku.administrator.form.LoginForm;
import com.kuku.administrator.form.UserForm;
import com.kuku.administrator.services.UserService;
import com.kuku.administrator.util.Constants;

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
		
		 //SecurityContextHolder.getContext().getAuthentication().getAuthorities();

		
		return "init";

	}
	
	/**
	 * 	Method to validate the login form data
	 * 
	 *  @return A String that especifies the action to validate the data form
	 *  
	 * **/

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String validateLogin(@ModelAttribute("loginForm") @Valid LoginForm loginForm,BindingResult result,HttpServletRequest request) {
		
		if(result.hasErrors()){
			
			return showLogin(loginForm, request);
			
		}

		
		return "forward:j_spring_security_check";

	}
	
	
	/**
	 * 	Method for setting the error message when a user does not exist and failed authentication
	 * 
	 *  @return A String that especifies the view to resolve
	 *  
	 * **/
	
	@RequestMapping(value="/attempt",method= RequestMethod.POST)
	 public String hoder(ModelMap model,@ModelAttribute("loginForm") LoginForm loginForm,HttpServletRequest request){
	                               
		model.addAttribute("error", "true");
		
		return "init";
	 }
		
	/*@RequestMapping(value="login",method= RequestMethod.POST)
	 public String showModalLogin(@RequestParam("j_username") String userName,@RequestParam("j_password") String password){
	    
		System.out.println("si entra");
		
		if(userName.isEmpty()){
		
			System.out.println("falla usuario");
			return Constants.FAIL;
			
		}else if(password.isEmpty()){
			
			System.out.println("falla pass");
			return Constants.FAIL;
			
		}else{
		
			return "forward:j_spring_security_check?j_username="+userName.trim()+"&j_password="+password.trim()+"";
			
		}
	
	 }*/
	
	/*
	 
	 @RequestMapping(value="modal/login",method= RequestMethod.GET)
	 public String showModalLogin(@ModelAttribute("loginForm") LoginForm loginForm,HttpServletRequest request){
	    
		System.out.println("si entra que mierda");
		
		return "init";
	
	 }
	 
	  */
			
}
