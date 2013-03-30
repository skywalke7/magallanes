package com.kuku.administrator.form;

import java.lang.annotation.Annotation;

import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.MetaValue;
import org.hibernate.validator.constraints.Email;

import com.kuku.administrator.util.NotEmpty;
import static com.kuku.administrator.util.Constants.EMAIL;



public class UserForm{
	
	@NotEmpty
	private String name;
	@NotEmpty
	private String lastName;
	@Email(message=EMAIL)
	@NotEmpty
	private String email;
	@NotEmpty
	private String password;
	@NotEmpty
	private String confirmPassowrd;
	@NotEmpty
	private String birthDay;
	@NotEmpty
	private String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassowrd() {
		return confirmPassowrd;
	}
	public void setConfirmPassowrd(String confirmPassowrd) {
		this.confirmPassowrd = confirmPassowrd;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	
}
