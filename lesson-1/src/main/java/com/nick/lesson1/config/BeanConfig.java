package com.nick.lesson1.config;

import com.nick.lesson1.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Java Config 方式（注解配置方式）配置类
 * @author NickFayne 2018-05-31 20:55
 */
@Configuration
public class BeanConfig {

    @Bean("person")
    public Person person(){
        return new Person("NickFayne", 18);
    }
}
