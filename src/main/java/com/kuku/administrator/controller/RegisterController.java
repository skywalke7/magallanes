package com.kuku.administrator.controller;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
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

import com.kuku.administrator.exceptions.EmailException;
import com.kuku.administrator.exceptions.PasswordException;
import com.kuku.administrator.exceptions.UserException;
import com.kuku.administrator.form.UserForm;
import com.kuku.administrator.services.UserService;
import com.kuku.administrator.util.Constants;

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
	 * 	method to retrieve values ​​by post, check errors or store them in the database by service user
	 * 
	 *  @param model For use when building model data for use with UI tools
	 *  @param userForm Object form
	 *  @param result General interface that represents binding results with form validation
	 *  @param request
	 *  @return A String that especifies the view to resolve
	 * 	 
	 *  
	 * **/
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
    public String addUser(ModelMap model,@ModelAttribute("userForm") @Valid UserForm userForm,BindingResult result,HttpServletRequest request){
		
		if(userForm.getSex() != null && !userForm.getSex().isEmpty()){
        	
        	model.addAttribute("gender", userForm.getSex());
        	
        }
		
        if(result.hasErrors()){
        	        	
        	model.addAttribute("error",false);
        	model.addAttribute("message", result.getFieldError().getDefaultMessage());
        	return showRegisterForm(userForm, request);
        	
        }
        
        try{
        	
        	userService.userRegister(userForm);
        	
        }catch(UserException e){
        	        	
        	model.addAttribute("error", false);
        	model.addAttribute("message", e.getMessage());
        	model.addAttribute("field", Constants.EMAIL_FIELD);
        	return showRegisterForm(userForm, request);
        	
        } catch (PasswordException e) {
        	
        	model.addAttribute("error", false);
        	model.addAttribute("message", e.getMessage());
        	model.addAttribute("field", Constants.PASSWORD_FIELD);
        	return showRegisterForm(userForm, request);
        	
		} catch (EmailException e) {
			
			model.addAttribute("error", true);
        	model.addAttribute("message", e.getMessage());
        	return showRegisterForm(userForm, request);
        	
		}
                
        return "redirect:/";
    }

}
