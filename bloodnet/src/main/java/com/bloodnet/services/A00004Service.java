package com.bloodnet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodnet.mappers.TblFatherSonMapper;
import com.bloodnet.mappers.TblMotherSonMapper;
import com.bloodnet.model.TblFatherSon;
import com.bloodnet.model.TblMotherSon;
import com.bloodnet.services.com.BaseService;
import com.bloodnet.services.com.CommonService;

@Service
public class A00004Service extends BaseService {

	@Autowired
	private TblMotherSonMapper tblMotherSonMapper;
	
	@Autowired
	private CommonService commonService;
	
	public void createMotherSon(final String sonId, final String motherId) {

		TblMotherSon fatherSon = new TblMotherSon();
		fatherSon.setsHumanId(sonId);
		fatherSon.setmHumanId(motherId);
		fatherSon.setUserId(sonId);
		fatherSon.setDelflg(false);
		tblMotherSonMapper.insert(fatherSon);
	}
}
