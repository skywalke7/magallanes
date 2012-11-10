package com.kuku.administrator.authentication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kuku.administrator.dao.UserDao;
import com.kuku.administrator.model.User;
import com.kuku.administrator.util.UtilAuthority;

public class KukuUserDetailsService implements UserDetailsService{

	@Autowired
	UserDao userDao;
	@Autowired
	UserDetails userDetails;

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		
		User user = this.userDao.findByUserName(username);
		
		if(user != null){
			
			List<GrantedAuthority> authorities = UtilAuthority.getAuthorities(user);
			System.out.println("ANTES DE RETORNAR EL USUARIO");
			return new KukuUserDetailsImpl(user.getUserName(), user.getPassword(), authorities);
			
		}else
			return null;

	}
		
}
