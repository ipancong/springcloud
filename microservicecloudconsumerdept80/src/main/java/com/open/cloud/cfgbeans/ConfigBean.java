package com.open.cloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    //Spring boot里面没有applicationContext.xml配置文件了，采用注解配置bean， ConfigBean = applicationContext.xml
    // <bean id="lalal" class="com.xxx.lalal">
    // 这个类相当于applicationContext.xml

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
