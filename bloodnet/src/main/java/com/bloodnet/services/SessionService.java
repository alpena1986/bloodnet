package com.bloodnet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bloodnet.lib.Session;
import com.bloodnet.mappers.TblHumanMapper;
import com.bloodnet.services.com.BaseService;
import com.bloodnet.services.com.CommonService;

@Service
public class SessionService extends BaseService {

	@Autowired
	private TblHumanMapper tblHumanMapper;
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * 登录。也就是验证用户信息是否正确
	 * 如果正确，返回sessionId
	 * 该sessionId必须被附带在之后的连接请求中
	 * @param userId 用户ID
	 * @param password 用户密码
	 * @return
	 */
	public String getSessionId(final String userId, final String password) {
		
		Session session = new Session();
		session.setUserId(userId);
		session.setPassword(password);
		HttpEntity<Session> formEntity = new HttpEntity<Session>(session, httpUtils.getCommonHttpHeaders());
		
		String sessionId = restTemplate.postForObject("http://localhost:8080/api/sessions", formEntity, String.class);
		return sessionId;
	}
}