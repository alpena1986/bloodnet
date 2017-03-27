package com.bloodnet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodnet.mappers.TblHumanMapper;
import com.bloodnet.model.TblHuman;
import com.bloodnet.services.com.BaseService;
import com.bloodnet.services.com.CommonService;

@Service
public class A00001Service extends BaseService {

	@Autowired
	private TblHumanMapper tblHumanMapper;
	
	@Autowired
	private CommonService commonService;
	
	public String createHuman(final String email, final String familyName, final String firstName, final String sex, final String birthday) {

		TblHuman human = new TblHuman();
		String humanId = commonService.getNumber("1", "1").toString();
		human.setHumanId(humanId);
		human.setEmail(email);
		human.setUserFamilyName(familyName);
		human.setUserFirstName(firstName);
		human.setSexDiv(sex);
		human.setBirthdate(birthday);
		human.setDelflg(false);
		tblHumanMapper.insert(human);
		return humanId;
	}
}
