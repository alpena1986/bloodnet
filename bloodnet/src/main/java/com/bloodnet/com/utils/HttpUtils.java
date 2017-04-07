package com.bloodnet.com.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.bloodnet.com.model.SystemUser;

@Component(value="httpUtils")
public class HttpUtils {
	
	public HttpUtils(){
		headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
	}
	
	@Autowired
	public SystemUser currentUser;
	
	public HttpHeaders headers;

	public final HttpHeaders getCommonHttpHeaders(){
		headers.set("acid", currentUser.getAcid());
		return headers;
	}
}
