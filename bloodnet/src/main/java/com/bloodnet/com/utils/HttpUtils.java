package com.bloodnet.com.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class HttpUtils {
	{
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
	}
	
	public static HttpHeaders headers;

	public static HttpHeaders getCommonHttpHeaders(){
		return headers;
	}
}
