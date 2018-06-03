package com.nick.lesson3.config;

import com.nick.lesson3.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Spring 配置类
 * @author NickFayne 2018-06-03 8:53
 */
@Configuration
public class ScopeConfig {

    //@Scope("prototype")
    @Bean
    public Person person(){
        return new Person();
    }
}
