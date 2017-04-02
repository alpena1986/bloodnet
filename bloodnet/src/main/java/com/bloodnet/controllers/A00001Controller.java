package com.bloodnet.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.bloodnet.controllers.com.BaseController;
import com.bloodnet.form.A00001Form;
import com.bloodnet.lib.Profile;
import com.bloodnet.services.A00001Service;


@Controller
public class A00001Controller extends BaseController {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private A00001Service a00001Service;
	
    @RequestMapping(value="/1", method=RequestMethod.GET)
    public String init(Model model, @ModelAttribute A00001Form form , HttpSession httpSession) throws Exception {
    	
    	jdbcTemplate.execute("select 1");
    	Profile p  = restTemplate.getForObject("http://localhost:8080/bloodnetapi/1", Profile.class);
    	p.getId();
        return "A00001";
    }
    
    @RequestMapping(value="/1/register", method=RequestMethod.POST)
    public String register(Model model,@ModelAttribute A00001Form form ,HttpSession httpSession) throws Exception {
    	a00001Service.createHuman(form.getEmail(), form.getFamilyName(), form.getFirstName(), form.getSex(), form.getBirthdate());
    	model.addAttribute("message", "登录成功");
        return "A00001";
    }
}