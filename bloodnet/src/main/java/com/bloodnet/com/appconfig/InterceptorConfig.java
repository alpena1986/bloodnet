package com.bloodnet.com.appconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

import com.bloodnet.com.interceptor.CSRFInterceptor;

@Configuration
@EnableWebMvc
public class InterceptorConfig  extends WebMvcConfigurerAdapter { 
	
//    @Bean
//    @Override
//    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
//        CustomRequestHandlerMapping handlerMapping = new CustomRequestHandlerMapping();
//        handlerMapping.setOrder(0);
//        handlerMapping.setInterceptors(getInterceptors()); // <-- This was missing
//        return handlerMapping;
//    }


    
    @Override
    public void addInterceptors(final InterceptorRegistry registry) {

        
//        registry.addInterceptor(getLocaleChangeInterceptor());
        
        
//        registry.addInterceptor(getAuthenticationInterceptor())
//                    .addPathPatterns("/**")
//                    .excludePathPatterns("/assets/**")
//                    .excludePathPatterns("/admin/login")
//                    .excludePathPatterns("/login" )
//                    .excludePathPatterns("/serviceout")
//                    .excludePathPatterns("/not-logged-in")
//                    .excludePathPatterns("/not-permitted-access")
//                    .excludePathPatterns("/devLoginAdmin")
//                    .excludePathPatterns("/devLoginNormal")
//                    .excludePathPatterns("/devLoginNormalNoDashBoard")
//                    .excludePathPatterns("/404");


//        registry.addInterceptor(webContentInterceptor())
//                    .addPathPatterns("/**")
//                    .excludePathPatterns("/assets/**");
//
//        registry.addInterceptor(tokenInterceptor())
//                    .addPathPatterns("/**")
//                    .excludePathPatterns("/assets/**");
//
//        
//        registry.addInterceptor(pageAccessControlInterceptor())
//                    .addPathPatterns("/**")
//                    .excludePathPatterns("/assets/**")
//                    .excludePathPatterns("/admin/login")
//                    .excludePathPatterns("/login" )
//                    .excludePathPatterns("/serviceout")
//                    .excludePathPatterns("/not-logged-in")
//                    .excludePathPatterns("/not-permitted-access")
//                    .excludePathPatterns("/devLoginAdmin")
//                    .excludePathPatterns("/devLoginNormal")
//                    .excludePathPatterns("/devLoginNormalNoDashBoard")
//                    .excludePathPatterns("/404");
        
//        registry.addInterceptor(getMyHandlerInterceptor())
//                    .includePathPatterns("/**")
//                    .excludePathPatterns("/**/*.ecxld");  
//
//        registry.addInterceptor(getInterceptorTwo());

    }

    
    
    private LocaleChangeInterceptor getLocaleChangeInterceptor(){
        
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        return localeChangeInterceptor;
    }

    private WebContentInterceptor webContentInterceptor(){
        
        WebContentInterceptor webContentInterceptor = new WebContentInterceptor();
        webContentInterceptor.setCacheSeconds(0);
        //webContentInterceptor.setUseExpiresHeader(true);
        //webContentInterceptor.setUseCacheControlHeader(true);
        webContentInterceptor.setCacheControl(CacheControl.noStore());
        
        return new WebContentInterceptor();
    }
    
    private CSRFInterceptor tokenInterceptor(){
        return new CSRFInterceptor();
    }
    
}
