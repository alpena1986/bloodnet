package com.bloodnet.services.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.bloodnet.com.consts.Consts;
import com.bloodnet.com.utils.Utils;
import com.bloodnet.mappers.TblFatherSonMapper;
import com.bloodnet.mappers.TblMotherSonMapper;
import com.bloodnet.mappers.TblSeqMapper;
import com.bloodnet.model.TblFatherSon;
import com.bloodnet.model.TblFatherSonExample;
import com.bloodnet.model.TblMotherSon;
import com.bloodnet.model.TblMotherSonExample;
import com.bloodnet.model.TblSeq;
import com.bloodnet.model.TblSeqExample;

@Service
public class CommonService{

    @Autowired
    protected MessageSource messageSource;
    
    @Autowired
    protected TblSeqMapper tblSeqMapper;
    
    @Autowired
    protected TblFatherSonMapper tblFatherSonMapper;
    
    @Autowired
    protected TblMotherSonMapper tblMotherSonMapper;
    
    public Integer getNumber(String a, String b){
    	
    	TblSeqExample example = new TblSeqExample();
    	TblSeqExample.Criteria criteria = example.createCriteria();
    	criteria.andFunctionCodeEqualTo("1");
    	criteria.andDivCodeEqualTo("1");
    	
    	List<TblSeq> seqList = tblSeqMapper.selectByExample(example);
    	int ret = seqList.get(0).getNo();
    	seqList.get(0).setNo(seqList.get(0).getNo() + 1);
    	tblSeqMapper.updateByExample(seqList.get(0), example);
    	return ret;
    }
    public String findWife(String id){
    	TblFatherSonExample fatherSonExample = new TblFatherSonExample();
    	TblFatherSonExample.Criteria criteria = fatherSonExample.createCriteria();
    	criteria.andFHumanIdEqualTo(id);
    	List<TblFatherSon> fatherSonList = tblFatherSonMapper.selectByExample(fatherSonExample);
    	
    	if(fatherSonList != null && fatherSonList.size() > 0){
    		TblMotherSonExample motherSonExample = new TblMotherSonExample();
    		TblMotherSonExample.Criteria criteria2 = motherSonExample.createCriteria();
    		criteria2.andSHumanIdEqualTo(fatherSonList.get(0).getsHumanId());
    		List<TblMotherSon> motherSonList = tblMotherSonMapper.selectByExample(motherSonExample);
    		if (motherSonList != null && motherSonList.size() != 0) {
    			return motherSonList.get(0).getmHumanId();
    		}
    	}
    	return null;
    }

    public String findHusband(String id){
    	TblMotherSonExample motherSonExample = new TblMotherSonExample();
    	TblMotherSonExample.Criteria criteria = motherSonExample.createCriteria();
    	criteria.andMHumanIdEqualTo(id);
    	List<TblMotherSon> motherSonList = tblMotherSonMapper.selectByExample(motherSonExample);
    	
    	if(motherSonList != null && motherSonList.size() > 0){
    		TblFatherSonExample fatherSonExample = new TblFatherSonExample();
    		TblFatherSonExample.Criteria criteria2 = fatherSonExample.createCriteria();
    		criteria2.andSHumanIdEqualTo(motherSonList.get(0).getsHumanId());
    		List<TblFatherSon> fatherSonList = tblFatherSonMapper.selectByExample(fatherSonExample);
    		if (fatherSonList != null && fatherSonList.size() != 0) {
    			return fatherSonList.get(0).getfHumanId();
    		}
    	}
    	return null;
    }
    
    public Set<Human> findChildren(Human h){
    	Set<Human> childSet = new HashSet<Human>();
    	if(Consts.SEX_MALE.equals(h.getSex())){
    		TblFatherSonExample fatherSonExample = new TblFatherSonExample();
    		TblFatherSonExample.Criteria criteria2 = fatherSonExample.createCriteria();
    		criteria2.andFHumanIdEqualTo(h.getId());
    		List<TblFatherSon> fatherSonList = tblFatherSonMapper.selectByExample(fatherSonExample);
			for (TblFatherSon fatherSon : Utils.safe(fatherSonList)) {
				childSet.add(new Human(fatherSon.getsHumanId(), fatherSon.getsSexDiv(),  h.relation + Consts.RELATION_IS_SON));
			}
    	} else {
        	TblMotherSonExample motherSonExample = new TblMotherSonExample();
        	TblMotherSonExample.Criteria criteria = motherSonExample.createCriteria();
        	criteria.andMHumanIdEqualTo(h.getId());
        	List<TblMotherSon> motherSonList = tblMotherSonMapper.selectByExample(motherSonExample);
			for (TblMotherSon motherSon : Utils.safe(motherSonList)) {
				childSet.add(new Human(motherSon.getsHumanId(), motherSon.getsSexDiv(),  h.relation + Consts.RELATION_IS_SON));
			}
    	}
    	return childSet;
    }
    
    
    public Set<Human> findFathers(Human h) {
    	Set<Human> fSet = new HashSet<Human>();
   		TblFatherSonExample fatherSonExample = new TblFatherSonExample();
		TblFatherSonExample.Criteria criteria = fatherSonExample.createCriteria();
		criteria.andSHumanIdEqualTo(h.getId());
		List<TblFatherSon> fatherSonList = tblFatherSonMapper.selectByExample(fatherSonExample);
		for (TblFatherSon fatherSon: Utils.safe(fatherSonList)) {
			fSet.add(new Human(fatherSon.getfHumanId(), Consts.SEX_MALE,  h.relation + Consts.RELATION_IS_FATHER));
		}
		return fSet;
    }
    
    
    public Set<Human> findMothers(Human h) {
    	Set<Human> mSet = new HashSet<Human>();
   		TblMotherSonExample motherSonExample = new TblMotherSonExample();
   		TblMotherSonExample.Criteria criteria = motherSonExample.createCriteria();
		criteria.andSHumanIdEqualTo(h.getId());
		List<TblMotherSon> motherSonList = tblMotherSonMapper.selectByExample(motherSonExample);
		for (TblMotherSon motherSon: Utils.safe(motherSonList)) {
			mSet.add(new Human(motherSon.getmHumanId(), Consts.SEX_FEMALE, h.relation + Consts.RELATION_IS_MOTHER));
		}
		return mSet;
    }
    
//    public List<String> findFamilyMember(String id, String sex) {
//    	String spouse = null;
//    	List<String> childList;
//    	if(Consts.SEX_MALE.equals(sex)){
//    		spouse = findWife(id);
//    	} else {
//    		spouse = findHusband(id);
//    	}
//    	childList = findChildren(id, sex);
//    	childList.add(spouse);
//    	return childList;
//    }
    
    public static class Human {
    	private String id;
    	private String sex;
    	private String relation;
    	public Human (String id, String sex, String relation) {
    		this.id = id;
    		this.sex = sex;
    		this.relation = relation;
    	}
    	@Override
    	public boolean equals (Object o) {
    		if (!(o instanceof Human)) 
    			return false;
    		Human h = (Human)o;
    		if (h.getId().equals(this.id) && h.getSex().equals(this.sex)) 
    			return true;
    		return false;
    	}
    	
    	@Override
    	public int hashCode(){
    		return Integer.valueOf(id);
    	}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getRelation() {
			return relation;
		}
		public void setRelation(String relation) {
			this.relation = relation;
		}
    }
    
    public Set<Human> findFamilies(Human h) {
    	Set<Human> fathers = findFathers(h);
    	Set<Human> mothers = findMothers(h);
    	Set<Human> children = findChildren(h);
    	
    	Set<Human> families = new HashSet<Human>();
    	families.addAll(fathers);
    	families.addAll(mothers);
    	families.addAll(children);
    	return families;
    }
    
    public Set<Human> findAllFamilies(Set<Human> hSet, Set<Human> doneSet){
    	Set<Human> s = new HashSet<>();
    	for(Human h : Utils.safe(hSet)){
    		Set<Human> tmp = findFamilies(h);
    		tmp.removeAll(doneSet);
    		s.addAll(tmp);
    	}
    	return s;
    }
    
    public Human isRelative(Human h1, Human h2){
    	Set<Human> s = new HashSet<>();
    	Set<Human> doneSet = new HashSet<>();
    	Set<Human> cacheDoneSet = new HashSet<>();
    	s.add(h1);
    	while(!s.contains(h2) && s.size() > 0) {
    		cacheDoneSet.addAll(s);
    		s = findAllFamilies(s, doneSet);
    		doneSet.addAll(cacheDoneSet);
    	}
    	Iterator<Human> iterator = s.iterator();
    	while(iterator.hasNext()){
    		Human tmp = (Human)iterator.next();
    		if (h2.equals(tmp) )
    			return tmp;
    	}
    	return null;
    }
}