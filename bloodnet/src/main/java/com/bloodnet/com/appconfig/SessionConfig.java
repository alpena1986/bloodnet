package com.bloodnet.com.appconfig;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.bloodnet.com.model.LoggedInUser;
import com.bloodnet.com.utils.BigDecimalUtils;
import com.bloodnet.services.com.CommonService;
import com.bloodnet.com.consts.Consts;

@Configuration
public class SessionConfig  extends WebMvcConfigurationSupport{

    @Autowired
    private CommonService commonService;
	
    @Bean
    public LoggedInUser loggedInUser(){
        return new LoggedInUser();
    }
   
    @Bean 
    public BigDecimalUtils bigDecimalUtils(){
        return new BigDecimalUtils();
    }
}