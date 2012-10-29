package com.kuku.administrator.dao;

import com.kuku.administrator.model.User;

public interface UserDao {

	public User findByUserName(String username);
	
}
