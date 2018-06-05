package com.nick.lesson7.config;

import com.nick.lesson7.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Aware 接口 配置类
 * @author NickFayne 2018-06-05 20:16
 */
@Configuration
public class AwareConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
