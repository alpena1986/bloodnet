package com.bloodnet.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class A00001Form {
	static final long serialVersionUID = 1L;
	
	@NotBlank
	private String userId;
	
	@NotBlank
	@Length(min=8, max=20)
	private String password;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
