package com.bloodnet.com.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.thymeleaf.util.StringUtils;

public class Utils{
	
    public static String getExceptionStackString(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        return sw.toString();
    }
    
    public static <T> List<T> safe( List<T> other ) {
        return other == null ? (List<T>)Collections.<T>emptyList() : other;
    }
    
    public static Cookie createSecureCookie(String key,String value){
    	value = StringUtils.replace(value, "\r\n", "");
    	value = StringUtils.replace(value, "\r", "");
    	value = StringUtils.replace(value, "\n", "");
    	
		Cookie cookie = new Cookie(key,value);
		cookie.setSecure(true);
		cookie.setHttpOnly(true);
		cookie.setPath("/");
		cookie.setMaxAge(60*60*24*186);  // 186 days
		return cookie;
    }
    
    public static boolean isAjax(HttpServletRequest request) {
        String requestedWithHeader = request.getHeader("X-Requested-With");
        return "XMLHttpRequest".equals(requestedWithHeader);
    }
    
}