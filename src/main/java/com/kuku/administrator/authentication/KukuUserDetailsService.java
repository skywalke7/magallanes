package com.kuku.administrator.authentication;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kuku.administrator.dao.UserDao;
import com.kuku.administrator.model.Authority;
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
		
		/*Set<Authority> a = user.getAuthority();
		
		System.out.println("NOMBRE DEL USUARIO --> " + user.getUserInfo().getUserName());
		
		for(Authority m : a){
			
			System.out.println("AUTORIDAD --> " + m.getAuthority());
			
			
		}*/
		
		
		
		if(user != null){
			
			List<GrantedAuthority> authorities = UtilAuthority.getAuthorities(user);
			System.out.println("ANTES DE RETORNAR EL USUARIO");
			return new KukuUserDetailsImpl(user.getUserName(), user.getPassword(), authorities);
			
		}else
			return null;

	}
		
}
