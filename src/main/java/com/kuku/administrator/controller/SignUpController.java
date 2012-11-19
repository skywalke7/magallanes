package com.kuku.administrator.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kuku.administrator.form.SignUpForm;

@Controller
public class SignUpController {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		logger.info("Returning SignUp view");

		ModelAndView modelAndView = new ModelAndView("signup");
		modelAndView.addObject("signUpForm", new SignUpForm());

		return modelAndView;

	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView getValues(SignUpForm form) {

		logger.info("The value of the first name field is "
				+ form.getFirstName());
		logger.info("The value of the last name field is " + form.getLastName());
		logger.info("The value of the email field is " + form.getEmail());
		logger.info("The value of the password field is " + form.getPassword());
		logger.info("The value of the confirm password is "
				+ form.getConfirmPassword());

		// Fix me Implement service ValidateUsuario

		return new ModelAndView("registrationcompleted");

	}

}
