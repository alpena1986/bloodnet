package com.bloodnet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bloodnet.lib.Error;
import com.bloodnet.lib.Profile;
import com.bloodnet.services.com.BaseService;
@Service
public class ProfileService extends BaseService {
	
	public static final String PATH = "/profiles";
	
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * 注册一个用户
	 * @param userId
	 * @param password
	 * @param profileId
	 * @param secondaryEmail
	 */
	public void createProfile(
			final String familyName, 
			final String firstName, 
			final String sex, 
			final String birthDate,
			final String idNumber) {
		
		Profile profile = new Profile();
		profile.setFamilyName(familyName);
		profile.setFirstName(firstName);
		profile.setBirthdate(birthDate);
		profile.setIdNumber(idNumber);
		profile.setSex(sex);
		
		HttpEntity<Profile> formEntity = new HttpEntity<Profile>(profile, httpUtils.getCommonHttpHeaders());
		
		restTemplate.postForEntity(
				apiUriBuilder.path(PATH).build().toString(), 
				formEntity, 
				Error.class);
	}
}
