package com.bloodnet.com.appconfig;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.remoting.SecureRemoteInvocationExecutor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.bloodnet.com.consts.Consts;
import com.bloodnet.com.security.ShiroRealm;
import com.bloodnet.com.security.WebAccessFilter;
@Configuration
@EnableTransactionManagement
@PropertySource(value = {"classpath:properties\\" + Consts.PROPERTY_FILE_JDBC})
public class DBConfig implements TransactionManagementConfigurer, EnvironmentAware{
   
	private Environment environment;
    
    @Override
    public void setEnvironment(final Environment environment) {
        this.environment = environment;
    }
    
    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        dataSource.setInitialSize(20);
        return dataSource;
    }
    
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
    
    @Bean
    public PlatformTransactionManager txManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return txManager();
    }
	@Bean
	public ShiroRealm shiroRealm(){
		ShiroRealm realm = new ShiroRealm();
		//realm.setDataSource(dataSource());
		//realm.setPermissionsLookupEnabled(true);
		//realm.setAuthenticationQuery("SELECT password FROM tbl_user WHERE user_id = ?");
		return realm;
	}
	
	@Bean 
	public DefaultWebSecurityManager securityManager(){
		DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
		manager.setRealm(shiroRealm());
		return manager;
	}
	
	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean shiroFilter(){
		ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
		bean.setSecurityManager(securityManager());
        Map<String, String> definitionsMap = new HashMap<>();
        definitionsMap.put("/**", "webAccessFilter");
        definitionsMap.put("/1/**", "anon");
        definitionsMap.put("/2/**", "anon");
        // TODO
        definitionsMap.put("/3/**", "anon");
        definitionsMap.put("/4/**", "anon");
        definitionsMap.put("/5/**", "anon");
        definitionsMap.put("/login/**", "anon");
        definitionsMap.put("/assets/**", "anon");
		bean.setFilterChainDefinitionMap(definitionsMap);
		return bean;
	}
	
	@Bean(name = "webAccessFilter")
	public WebAccessFilter webAccessFilter(){
		WebAccessFilter webAccessFilter = new WebAccessFilter();
		return webAccessFilter;
	}
	
	@Bean
	public SecureRemoteInvocationExecutor secureRemoteInvocationExecutor() {
		SecureRemoteInvocationExecutor executor = new SecureRemoteInvocationExecutor();
		executor.setSecurityManager(securityManager());
		return new SecureRemoteInvocationExecutor();
	}
	
	@Bean LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
		return new LifecycleBeanPostProcessor();
	}
	
	@Bean
	@DependsOn("lifecycleBeanPostProcessor")
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
		DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
		return creator;
	}
	
	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(){
		AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
		advisor.setSecurityManager(securityManager());
		return advisor;
	}
}