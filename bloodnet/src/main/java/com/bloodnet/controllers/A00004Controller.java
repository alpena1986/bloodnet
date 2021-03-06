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
import com.bloodnet.form.A00004Form;
import com.bloodnet.services.A00001Service;
import com.bloodnet.services.A00002Service;
import com.bloodnet.services.A00004Service;


@Controller
public class A00004Controller extends BaseController {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private A00001Service a00001Service;
	
	@Autowired
	private A00004Service a00004Service;
	
    @RequestMapping(value="/4", method=RequestMethod.GET)
    public String init(Model model, @ModelAttribute A00004Form form , HttpSession httpSession) throws Exception {
    	
        return "A00004";
    }
    
    @RequestMapping(value="/4/register", method=RequestMethod.POST)
    public String register(Model model,@ModelAttribute A00004Form form ,HttpSession httpSession) throws Exception {
    	
    	String sonId = a00001Service.createHuman(form.getEmail(), form.getFamilyName(), form.getFirstName(), form.getSex(), form.getBirthdate());
    	a00004Service.createMotherSon(sonId, form.getMotherId());
    	model.addAttribute("message", "登录成功");
        return "A00004";
    }
}