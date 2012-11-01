package com.kuku.administrator.authentication;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kuku.administrator.dao.UserDao;

public class KukuUserDetailsService implements UserDetailsService{

	UserDao userDao;
	
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		
		System.out.println("ANTES DE LA CONSULTA");
		this.userDao.findByUserName(username);
		System.out.println("NOMBRE DE USUARIO --> " + username);	
		
		return null;
	}

}
