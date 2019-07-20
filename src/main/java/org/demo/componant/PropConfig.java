package org.demo.componant;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropConfig {

    @Bean
    @ConfigurationProperties(prefix = "my")
    public ServerComponent serverComponent() {
        return new ServerComponent();
    }
}
