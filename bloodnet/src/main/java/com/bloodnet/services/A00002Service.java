package com.bloodnet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodnet.mappers.TblFatherSonMapper;
import com.bloodnet.model.TblFatherSon;
import com.bloodnet.services.com.BaseService;
import com.bloodnet.services.com.CommonService;

@Service
public class A00002Service extends BaseService {

	@Autowired
	private TblFatherSonMapper tblFatherSonMapper;
	
	@Autowired
	private CommonService commonService;
	
	public void createFatherSon(final String sonId, final String fatherId) {

		TblFatherSon fatherSon = new TblFatherSon();
		fatherSon.setsHumanId(sonId);
		fatherSon.setfHumanId(fatherId);
		fatherSon.setUserId(sonId);
		fatherSon.setDelflg(false);
		tblFatherSonMapper.insert(fatherSon);
	}
}
