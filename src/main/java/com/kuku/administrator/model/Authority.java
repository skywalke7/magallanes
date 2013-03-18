package com.kuku.administrator.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
//@Table(name = "AUTHORITIES")
@Table(name = "AUTHORITIES",uniqueConstraints = {@UniqueConstraint(columnNames = {"USERNAME","AUTHORITY"})})
public class Authority implements Serializable {

	private static final long serialVersionUID = 5408025146900655496L;

	/*@Id
	@Column(name = "AUTHORITY_ID")
	@GeneratedValue
	private Integer authorityId;*/
	@Id
	@Column(name = "USERNAME")
	private String userName;
	@Column(name = "AUTHORITY")
	private String authority;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	/*public int getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}*/

}
