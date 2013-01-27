package com.kuku.administrator.authentication;

import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

public class KukuUserDetailsService implements UserDetailsService {

	
	// injection DAOs and userDetails
	
	@Autowired
	UserDao userDao;
	@Autowired
	UserDetails userDetails;

	protected final Log logger = LogFactory.getLog(getClass());
	
	/**
	 * 	Method to load the username and send it to userDao to check its existence 
	 *  in the database, also prepares user roles into of the GrantedAuthority object.  
	 * 
	 *  @param A String username
	 *  @return A object of type UserDetails with information of the user
	 *  @return null if the user is not found in the database
	 *  
	 * **/

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {

		User user = this.userDao.findByUserName(username);

		if (user != null) {

			List<GrantedAuthority> authorities = UtilAuthority
					.getAuthorities(user);


			return new KukuUserDetailsImpl(user.getUserName(),
					user.getPassword(), authorities);

		} else {
			
			return new KukuUserDetailsImpl();
		}

	}

}
