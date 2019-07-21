package org.liguang.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.servlet.ShiroFilter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.Filter;
import java.util.HashMap;
import java.util.Map;

@Component
public class PostProcessConfig {

//    @Autowired
//    DefaultShiroFilterChainDefinition shiroFilterChainDefinition;
//
//    @PostConstruct
//    public void shiroFilter() {
////        shiroFilterChainDefinition.addPathDefinition("/login.html", "authc"); // need to accept POSTs from the login form
////        shiroFilterChainDefinition.addPathDefinition("/logout", "logout");
//    }


}
