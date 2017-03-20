package com.bloodnet.controllers;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bloodnet.controllers.com.BaseController;


@Controller
public class A00001Controller extends BaseController {
    
    @RequestMapping(value="/admin", method=RequestMethod.GET)
    public String init(Model model, HttpSession httpSession,  Locale locale) throws Exception {
    	
        return "A00001";
    }
}