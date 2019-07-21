package org.liguang.config;


//import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
//import org.apache.shiro.realm.Realm;
//import org.apache.shiro.realm.text.TextConfigurationRealm;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
//import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ShiroConfig {



//    /**
//     * 自定义realm
//     *
//     * @return
//     */
//    @Bean
//    public Realm realm() {
//        TextConfigurationRealm realm = new TextConfigurationRealm();
//        realm.setUserDefinitions("joe.coder=password,user\n" +
//                "jill.coder=password,admin");
//
//        realm.setRoleDefinitions("admin=read,write\n" +
//                "user=read");
//        realm.setCachingEnabled(true);
//        return realm;
//    }
//
//    /**
//     * 安全管理器
//     * 注：使用shiro-spring-boot-starter 1.4时，返回类型是SecurityManager会报错，直接引用shiro-spring则不报错
//     *
//     * @return
//     */
//    @Bean
//    public DefaultWebSecurityManager securityManager() {
//        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//        securityManager.setRealm(realm());
//        return securityManager;
//    }



//    @Bean
//    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
//        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
//        chainDefinition.addPathDefinition("/login", "authc"); // need to accept POSTs from the login form
//        chainDefinition.addPathDefinition("/logout", "logout");
//        return chainDefinition;
//    }

}
