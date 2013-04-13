package com.kuku.administrator.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kuku.administrator.dao.UserDao;
import com.kuku.administrator.form.UserForm;
import com.kuku.administrator.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@SuppressWarnings("unchecked")
	public User findByUserName(String username) {

		String query = "FROM User u WHERE u.userName = ?";

		List<User> user = getHibernateTemplate().find(query, username);

		if (user != null && user.size() > 0) {
			return user.get(0);
		} else {
			return null;
		}
	}

	public void addUser(User user) {

		getHibernateTemplate().save(user);
		
		
	}

}
