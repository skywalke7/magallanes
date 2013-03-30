package com.kuku.administrator.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kuku.administrator.form.UserForm;
import com.kuku.administrator.services.UserService;
import static com.kuku.administrator.util.Constants.EMAIL;

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
	public String showRegisterForm(@ModelAttribute("userForm") UserForm userForm,HttpServletRequest request){
		
		
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
	
	/*@RequestMapping(value="/register",method= RequestMethod.POST)
	public @ResponseBody String saveRegisterUser(ModelMap model,@ModelAttribute("userForm") @Valid UserForm userForm,BindingResult result,HttpServletRequest request){
		
		System.out.println("si entre que peso");
		
		if(result.hasErrors()){
						
			System.out.println("con errores shit");
			return "error";
			
		}else{
			System.out.println("sin pedos joder");
			return "success";
			
		}
		
		//return "redirect:/";
		
	}*/
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
    public String addUser(ModelMap model,@ModelAttribute("userForm") @Valid UserForm userForm,BindingResult result,HttpServletRequest request){
		
		if(userForm.getSex() != null && !userForm.getSex().isEmpty()){
        	
        	model.addAttribute("gender", userForm.getSex());
        	
        }
		
        if(result.hasErrors()){
        	
        	model.addAttribute("error", result.getFieldError().getDefaultMessage().equals(EMAIL)?true:false);
        	return showRegisterForm(userForm, request);
        	
        }
                
        return "redirect:/";
    }

}
