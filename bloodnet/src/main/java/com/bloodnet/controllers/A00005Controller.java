package com.bloodnet.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bloodnet.com.consts.Consts;
import com.bloodnet.com.utils.Utils;
import com.bloodnet.controllers.com.BaseController;
import com.bloodnet.form.A00003Form;
import com.bloodnet.form.A00004Form;
import com.bloodnet.form.A00005Form;
import com.bloodnet.services.A00001Service;
import com.bloodnet.services.A00002Service;
import com.bloodnet.services.A00004Service;
import com.bloodnet.services.com.CommonService;
import com.bloodnet.services.com.CommonService.Human;


@Controller
public class A00005Controller extends BaseController {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private A00001Service a00001Service;
	
	@Autowired
	private CommonService commonService;
	
	@Autowired
	private A00004Service a00004Service;
	
    @RequestMapping(value="/5", method=RequestMethod.GET)
    public String init(Model model, @ModelAttribute A00005Form form , HttpSession httpSession) throws Exception {
    	
        return "A00005";
    }
    
    @RequestMapping(value="/5/register", method=RequestMethod.POST)
    public String register(Model model,@ModelAttribute A00005Form form ,HttpSession httpSession) throws Exception {
    	Human h = commonService.isRelative(new Human(form.getaId(), Consts.SEX_MALE, ""), new Human(form.getbId(), Consts.SEX_MALE, ""));
    	if (h == null) {
    		model.addAttribute("message", "不是亲戚！");
    	} else {
    		model.addAttribute("message", "A" + Utils.tranlateRelation(h.getRelation()) + "是B");
    	}
        return "A00005";
    }
}