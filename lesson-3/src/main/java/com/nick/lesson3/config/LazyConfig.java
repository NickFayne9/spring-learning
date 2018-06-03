package com.nick.lesson3.config;

import com.nick.lesson3.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Spring 测试 Lazy 注解配置类
 * @author NickFayne 2018-06-03 9:11
 */
@Configuration
public class LazyConfig {

    //@Lazy
    @Bean
    public Person person(){
        return new Person();
    }
}
