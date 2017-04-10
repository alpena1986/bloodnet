package com.bloodnet.com.appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.bloodnet.com.utils.BigDecimalUtils;

@Configuration
public class SessionConfig{
   
    @Bean
    public BigDecimalUtils bigDecimalUtils(){
        return new BigDecimalUtils();
    }
}