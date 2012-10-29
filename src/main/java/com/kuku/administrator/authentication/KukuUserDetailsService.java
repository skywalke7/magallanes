package com.kuku.administrator.authentication;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class KukuUserDetailsService implements UserDetailsService{

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		
		System.out.println("NOMBRE DE USUARIO --> " + username);
		
		
		
		
		return null;
	}

}
