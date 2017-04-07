package com.bloodnet.com.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;


@Component(value="loggedInUser")
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS) 
public class SystemUser {

	private String email;
	private String acid;
	
	public String getAcid() {
		return acid;
	}
	public void setAcid(String acid) {
		this.acid = acid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
