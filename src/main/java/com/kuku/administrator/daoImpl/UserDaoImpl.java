package com.kuku.administrator.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kuku.administrator.dao.UserDao;
import com.kuku.administrator.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	public User findByUserName(String username) {
		
		String query = "FROM User u WHERE u.userName = ?";
		
		System.out.println(getHibernateTemplate());
		
		List<User> user = getHibernateTemplate().find(query,username);
		
		if(user!= null && user.size()>0)
			return user.get(0);
		
		return null;
	}

}
