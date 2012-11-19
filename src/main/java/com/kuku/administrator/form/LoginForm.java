package com.kuku.administrator.form;

<<<<<<< HEAD
public class LoginForm{

    private String j_username;

    private String j_password;


    /**
     * @return the j_username
     */
    public String getJ_username() {
        return j_username;
    }

    /**
     * @param j_username the j_username to set
     */
    public void setJ_username(String j_username) {
        this.j_username = j_username;
    }

    /**
     * @return the j_password
     */
    public String getJ_password() {
        return j_password;
    }

    /**
     * @param j_password the j_password to set
     */
    public void setJ_password(String j_password) {
        this.j_password = j_password;
    }
=======
import java.io.Serializable;

public class LoginForm implements Serializable {

	private static final long serialVersionUID = -1564855946617773785L;

	private String userName;

	private String password;

	private String j_username;

	private String j_password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
>>>>>>> Warnings supressed and all source code formatted

}
