package com.kuku.administrator.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;


import com.kuku.administrator.model.Authority;
import com.kuku.administrator.model.User;

public class UtilAuthority {
	
	
	public static List<GrantedAuthority> getAuthorities(User user){
		
		List<GrantedAuthority> listAuthorities = new ArrayList<GrantedAuthority>();
		Set<Authority> authorities = user.getAuthority();
		
		for(Authority ua : authorities)
			listAuthorities.add(new GrantedAuthorityImpl(ua.getAuthority()));
		
		return listAuthorities;
	}
	
	
}