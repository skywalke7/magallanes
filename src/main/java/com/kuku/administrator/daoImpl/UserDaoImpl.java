package com.kuku.administrator.daoImpl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kuku.administrator.dao.UserDao;
import com.kuku.administrator.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	public User findByUserName(String username) {
		
		User user = (User) getSession().createQuery("from user");
		
		System.out.println("USUARIO DE LA BASE --> " + user);
		
		
		return null;
	}

}
