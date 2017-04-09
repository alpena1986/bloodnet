package com.bloodnet.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.bloodnet.com.consts.Consts;
import com.bloodnet.lib.Error;
import com.bloodnet.lib.User;
import com.bloodnet.services.com.BaseService;
@Service
public class UserService extends BaseService {
	
	public static final String PATH = "/users";
	
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * 注册一个用户
	 * @param userId
	 * @param password
	 * @param profileId
	 * @param secondaryEmail
	 */
	public void createUser(
			final String userId, 
			final String password, 
			final String profileId, 
			final String secondaryEmail) {
		
		User user = new User();
		user.setId(userId);
		user.setPassword(password);
		user.setProfileId(profileId);
		user.setSecondaryEmail(secondaryEmail);
		HttpEntity<User> formEntity = new HttpEntity<User>(user, httpUtils.getCommonHttpHeaders());
		String uri = new StringBuffer().append(Consts.BASE_API_URI).append(PATH).toString();
		try{
			restTemplate.postForEntity(uri, formEntity, Error.class);
		} catch (HttpStatusCodeException ex) {
			String err = ex.getResponseBodyAsString();
			throw ex;
		}
	}
	
	/**
	 * 获取一个用户
	 * @param userId
	 */
	public User getUser(final String userId) {

		Map<String,String> urlVariables = new HashMap<String, String>();
		urlVariables.put("id", userId);
		String uri = new StringBuffer().append(Consts.BASE_API_URI).append(PATH).append("/{id}").toString();
	
		ResponseEntity<User> response = null;
		try{
			response = 
					restTemplate.exchange(uri, HttpMethod.GET, httpUtils.getHttpCommonEntity(), User.class, urlVariables);
			User user = (User)response.getBody();
			return user;
		} catch (HttpStatusCodeException ex) {
			String err = ex.getResponseBodyAsString();
			throw ex;
		}
	}
}
