package com.bloodnet.controllers;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bloodnet.controllers.com.BaseController;
import com.bloodnet.form.A00002Form;
import com.bloodnet.services.A00001Service;
import com.bloodnet.services.A00002Service;
import com.bloodnet.services.A00004Service;
import com.bloodnet.services.UserService;


@Controller
public class A00002Controller extends BaseController {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private A00001Service a00001Service;
	
	@Autowired
	private A00002Service a00002Service;
	
	@Autowired
	private A00004Service a00004Service;
	
    @RequestMapping(value="/2", method=RequestMethod.GET)
    public String init(Model model, @ModelAttribute A00002Form form , HttpSession httpSession) throws Exception {
    	
        return "A00002";
    }
    
    @RequestMapping(value="/2/register", method=RequestMethod.POST)
    public String register(Model model,@ModelAttribute A00002Form form ,HttpSession httpSession) throws Exception {
    	String userId = form.getUserId();
    	String password = form.getPassword();
    	userService.createUser(userId, password, "aaaaaa", "2nd email");
    	model.addAttribute("message", "注册成功");
        return "A00002";
    }
}