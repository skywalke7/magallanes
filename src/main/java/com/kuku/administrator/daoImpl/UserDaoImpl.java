package com.kuku.administrator.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kuku.administrator.dao.UserDao;
import com.kuku.administrator.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	public User findByUserName(String username) {
		
		System.out.println("ADENTRO DEL DAO?? =)");
		List<User> user = getHibernateTemplate().find("FROM User WHERE USERNAME = " + username);
		
		if(user!= null && user.size()>0)
			return user.get(0);
		
		return null;
	}

}
