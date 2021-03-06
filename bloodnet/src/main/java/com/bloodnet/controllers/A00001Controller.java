package com.bloodnet.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.bloodnet.controllers.com.BaseController;
import com.bloodnet.form.A00001Form;
import com.bloodnet.lib.Profile;
import com.bloodnet.services.A00001Service;
import com.bloodnet.services.SessionService;
import com.bloodnet.services.UserService;


@Controller
public class A00001Controller extends BaseController {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private A00001Service a00001Service;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SessionService sessionService;
	
    @RequestMapping(value="/1", method=RequestMethod.GET)
    public String init(Model model, @ModelAttribute A00001Form form) throws Exception {

        return "A00001";
    }
    
    @RequestMapping(value="/1/register", method=RequestMethod.POST)
    public String register(Model model,@ModelAttribute @Valid A00001Form form, BindingResult result) throws Exception {
    	if(result.hasErrors()) {
    		return "A00001";
    	}
		UsernamePasswordToken token = new UsernamePasswordToken(form.getUserId(), form.getPassword());
		final Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
    		loggedInUser.setEmail(form.getUserId());
    		model.addAttribute("message", "登录成功");
    		return "A00003";
		} catch (AuthenticationException ex) {
	    	model.addAttribute("message", "登录失败");
	        return "A00001";
		}
    }
}