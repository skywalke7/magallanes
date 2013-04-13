package com.kuku.administrator.servicesImpl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

import com.kuku.administrator.dao.UserDao;
import com.kuku.administrator.exceptions.EmailException;
import com.kuku.administrator.exceptions.PasswordException;
import com.kuku.administrator.exceptions.UserException;
import com.kuku.administrator.form.LoginForm;
import com.kuku.administrator.form.UserForm;
import com.kuku.administrator.model.Authority;
import com.kuku.administrator.model.User;
import com.kuku.administrator.model.UserInfo;
import com.kuku.administrator.services.UserService;
import com.kuku.administrator.util.Constants;
import com.kuku.administrator.util.Util;
import static com.kuku.administrator.util.Constants.ROLE_USER; ;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	@Autowired
	PasswordEncoder passwordEncoder;
	String encodePassword = null;

	public void userRegister(UserForm user) throws UserException,PasswordException,EmailException{
		
		if(!Util.validateEmail(user.getEmail())){
			throw new EmailException(Constants.INVALID_EMAIL);
		}
		
		if(!user.getPassword().equals(user.getConfirmPassowrd())){
			throw new PasswordException(Constants.PASSWORDS_DO_NOT_MATCH);
		}
		
		if(userDao.findByUserName(user.getEmail()) != null){
			throw new UserException(Constants.USER_ALREADY_EXIST);
		}else{
			
			encodePassword = passwordEncoder.encodePassword(user.getPassword(), user.getEmail());
			User userModel = new User();
			userModel.setUserName(user.getEmail());
			userModel.setPassword(encodePassword);
			userModel.setEnabled(true);
			
			UserInfo userInfoModel = new UserInfo();
			userInfoModel.setName(user.getName());
			userInfoModel.setLastName(user.getLastName());
			userInfoModel.setUserName(user.getEmail());
			userInfoModel.setBirthDay(Util.converStringToDate(user.getBirthDay()));
			userInfoModel.setSex(Integer.valueOf(user.getSex()));
			userModel.setUserInfo(userInfoModel);
			
			Authority authorityModel = new Authority();
			authorityModel.setAuthority(ROLE_USER);
			authorityModel.setUserName(user.getEmail());
			Set<Authority> authorities = new HashSet<Authority>();
			authorities.add(authorityModel);
			userModel.setAuthority(authorities);
						
			//userDao.addUser(userModel);
						
		}
		
	}

}
