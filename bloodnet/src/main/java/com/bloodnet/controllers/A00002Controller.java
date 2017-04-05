package com.bloodnet.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bloodnet.com.consts.Consts;
import com.bloodnet.controllers.com.BaseController;
import com.bloodnet.form.A00001Form;
import com.bloodnet.form.A00002Form;
import com.bloodnet.services.A00001Service;
import com.bloodnet.services.A00002Service;
import com.bloodnet.services.A00004Service;


@Controller
public class A00002Controller extends BaseController {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private A00001Service a00001Service;
	
	@Autowired
	private A00002Service a00002Service;
	
	@Autowired
	private A00004Service a00004Service;
	
    @RequestMapping(value="/2", method=RequestMethod.GET)
    public String init(Model model, @ModelAttribute A00002Form form , HttpSession httpSession) throws Exception {
    	
    	//jdbcTemplate.execute("select 1");
        return "A00002";
    }
    
    @RequestMapping(value="/2/register", method=RequestMethod.POST)
    public String register(Model model,@ModelAttribute A00002Form form ,HttpSession httpSession) throws Exception {
    	
    	/*String parentId = a00001Service.createHuman(form.getEmail(), form.getFamilyName(), form.getFirstName(), form.getSex(), form.getBirthdate());
    	if (Consts.SEX_MALE.equals(form.getSex())) {
    		a00002Service.createFatherSon(form.getSonId(), parentId);
    	}else {
    		a00004Service.createMotherSon(form.getSonId(), parentId);
    	}
    	
    	model.addAttribute("message", "登录成功");*/
        return "A00002";
    }
}