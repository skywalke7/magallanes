package com.kuku.administrator.services;

import com.kuku.administrator.exceptions.EmailException;
import com.kuku.administrator.exceptions.PasswordException;
import com.kuku.administrator.exceptions.UserException;
import com.kuku.administrator.form.UserForm;
import com.kuku.administrator.model.User;

public interface UserService{
	
	public void userRegister(UserForm user) throws UserException,PasswordException,EmailException;
		
	
}
