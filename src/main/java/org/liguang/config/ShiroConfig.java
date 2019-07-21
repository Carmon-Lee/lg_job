package org.liguang.config;

import org.apache.shiro.realm.Realm;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ShiroConfig {


    @Autowired
    private DataSource dataSource;

    /**
     * 自定义realm
     *
     * @return
     */
    @Bean
    public Realm realm() {
        MyJdbcRealm myJdbcRealm = new MyJdbcRealm();
        myJdbcRealm.setDataSource(dataSource);
        return myJdbcRealm;
    }

    @Bean
    public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {

        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setUsePrefix(true);

        return defaultAdvisorAutoProxyCreator;
    }

}
