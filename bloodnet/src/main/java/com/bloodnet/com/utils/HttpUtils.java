package com.bloodnet.com.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.bloodnet.com.model.SystemUser;

@Component(value="httpUtils")
public class HttpUtils {
	
	@Autowired
	public SystemUser currentUser;
	
	public HttpHeaders headers;
	
	public HttpUtils(){
		headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		//List<MediaType> mediaTypeList = new ArrayList<>();
		//mediaTypeList.add(MediaType.APPLICATION_JSON);
		//mediaTypeList.add(MediaType.APPLICATION_JSON_UTF8);
		//mediaTypeList.add(MediaType.ALL);
		//headers.setAccept(mediaTypeList);
	}

	public final HttpHeaders getCommonHttpHeaders(){
		headers.set("acid", currentUser.getAcid());
		return headers;
	}
	
	public final HttpEntity<String> getHttpCommonEntity(){
		
		HttpEntity<String> entity = new HttpEntity<String>("parameters", getCommonHttpHeaders());
		return entity;
	}
}
