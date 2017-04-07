package com.bloodnet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bloodnet.lib.Error;
import com.bloodnet.lib.User;
import com.bloodnet.services.com.BaseService;
@Service
public class UserService extends BaseService {
	
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
		
		restTemplate.postForEntity("http://localhost:8080/api/users", formEntity, Error.class);
	}
}
