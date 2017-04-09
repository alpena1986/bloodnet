package com.bloodnet.form;

import org.hibernate.validator.constraints.NotBlank;

public class A00001Form {
	
	@NotBlank(message="{userId.null}")
	private String userId;
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
