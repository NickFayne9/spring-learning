package com.nick.lesson8.config;

import com.nick.lesson8.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * PropertySource Value 注解 配置类
 * @author NickFayne 2018-06-05 20:35
 */
@Configuration
@PropertySource(value = "classpath:person.properties")
public class PropertyValueConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
