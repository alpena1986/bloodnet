package com.bloodnet.services.com;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import com.bloodnet.com.utils.BigDecimalUtils;
import com.bloodnet.com.utils.HttpUtils;



@Service
public class BaseService{

    @Autowired
    protected BigDecimalUtils bigDecimalUtils;
    
    @Autowired
    protected MessageSource messageSource;
    
    @Autowired
    protected HttpUtils httpUtils;

    @Resource(name="apiUriBuilder")
    protected UriComponentsBuilder apiUriBuilder;
}
