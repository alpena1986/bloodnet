package com.bloodnet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bloodnet.com.consts.Consts;
import com.bloodnet.lib.RestResponseBody;
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
			final String birthYear,
			final String idNumber) {
		
		Profile profile = new Profile();
		profile.setFamilyName(familyName);
		profile.setFirstName(firstName);
		profile.setBirthYear(birthYear);
		profile.setIdNumber(idNumber);
		profile.setSex(sex);
		
		HttpEntity<Profile> formEntity = new HttpEntity<Profile>(profile, httpUtils.getCommonHttpHeaders());
		String uri = new StringBuffer().append(Consts.BASE_API_URI).append(PATH).toString();
		
		restTemplate.postForEntity(uri, formEntity, RestResponseBody.class);
	}
}
