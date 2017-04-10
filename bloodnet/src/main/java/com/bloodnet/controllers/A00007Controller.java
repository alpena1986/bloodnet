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
import com.bloodnet.form.A00006Form;
import com.bloodnet.services.A00001Service;
import com.bloodnet.services.A00004Service;
import com.bloodnet.services.SessionService;
import com.bloodnet.services.UserService;
import com.bloodnet.services.com.CommonService;


@Controller
public class A00007Controller extends BaseController {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private A00001Service a00001Service;
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private A00004Service a00004Service;
	
	@Autowired
	private SessionService sessionService;
	
	@Autowired
	private UserService userService;
	
    @RequestMapping(value="/7", method=RequestMethod.GET)
    public String init(Model model) throws Exception {
    	
        return "A00007";
    }
    
}