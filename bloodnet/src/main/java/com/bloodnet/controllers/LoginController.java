package com.bloodnet.controllers;

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

import com.bloodnet.controllers.com.BaseController;
import com.bloodnet.form.LoginForm;
import com.bloodnet.services.A00001Service;
import com.bloodnet.services.A00004Service;
import com.bloodnet.services.SessionService;
import com.bloodnet.services.UserService;
import com.bloodnet.services.com.CommonService;


@Controller
public class LoginController extends BaseController {
    
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
	
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String init(Model model,@ModelAttribute LoginForm form) throws Exception {
    	
    	return "redirect:/home";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String get(Model model,@ModelAttribute LoginForm form) throws Exception {
    	
    	form.setUserId("123@123.com");
    	form.setPassword("123");
        return "login";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String post(Model model,@ModelAttribute LoginForm form, BindingResult result) throws Exception {
    	if(result.hasErrors()) {
    		return "login";
    	}
		UsernamePasswordToken token = new UsernamePasswordToken(form.getUserId(), form.getPassword());
		final Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
    		loggedInUser.setEmail(form.getUserId());
    		model.addAttribute("message", "登录成功");
    		return "redirect:/home";
		} catch (AuthenticationException ex) {
	    	model.addAttribute("message", "登录失败");
	        return "login";
		}
    }
    
}