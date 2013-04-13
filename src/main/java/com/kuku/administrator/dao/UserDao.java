package com.kuku.administrator.dao;

import com.kuku.administrator.form.UserForm;
import com.kuku.administrator.model.User;

public interface UserDao {

	public User findByUserName(String username);
	
	public void addUser(User user);
	
}
