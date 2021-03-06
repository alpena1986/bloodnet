package com.bloodnet.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bloodnet.controllers.com.BaseController;
import com.bloodnet.form.A00003Form;
import com.bloodnet.services.A00001Service;
import com.bloodnet.services.A00002Service;
import com.bloodnet.services.ProfileService;


@Controller
public class A00003Controller extends BaseController {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private A00001Service a00001Service;
	
	@Autowired
	private A00002Service a00002Service;
	
    @RequestMapping(value="/3", method=RequestMethod.GET)
    public String init(Model model, @ModelAttribute A00003Form form , HttpSession httpSession) throws Exception {

    	//profileService.createProfile("李", "某某", "01", "20160401", "230826198777771111");
        return "A00003";
    }
    
    @RequestMapping(value="/3/register", method=RequestMethod.POST)
    public String register(Model model,@ModelAttribute A00003Form form ,HttpSession httpSession) throws Exception {
    	
    	String sonId = a00001Service.createHuman(form.getEmail(), form.getFamilyName(), form.getFirstName(), form.getSex(), form.getBirthdate());
    	a00002Service.createFatherSon(sonId, form.getFatherId());
    	model.addAttribute("message", "登录成功");
        return "A00003";
    }
}