package com.nick.springlearning.config;

import com.nick.springlearning.filter.MyFilterType;
import com.nick.springlearning.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Java Config 方式（注解配置方式）配置类
 * @author NickFayne 2018-05-31 20:55
 */
@Configuration
//@ComponentScan(value = "com.nick",
//        useDefaultFilters = false,
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
@ComponentScan(value = "com.nick",
        useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = MyFilterType.class)})
public class BeanConfig {

    @Bean("person")
    public Person person(){
        return new Person("NickFayne", 18);
    }
}
