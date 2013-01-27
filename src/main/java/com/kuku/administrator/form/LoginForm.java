package com.kuku.administrator.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm implements Serializable {

	private static final long serialVersionUID = -1564855946617773785L;

	@NotEmpty(message="Introduzca un usuario")
	private String j_username;
	@NotEmpty(message="Introduzca la contraseña")
	private String j_password;


	public String getJ_username() {
		return j_username;
	}

	public void setJ_username(String j_username) {
		this.j_username = j_username;
	}

	public String getJ_password() {
		return j_password;
	}

	public void setJ_password(String j_password) {
		this.j_password = j_password;
	}	

}
