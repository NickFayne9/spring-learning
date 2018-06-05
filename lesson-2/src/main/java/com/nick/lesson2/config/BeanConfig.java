package com.nick.lesson2.config;


import com.nick.lesson2.filter.MyFilterType;
import com.nick.lesson2.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Java Config 方式（注解配置方式）配置类
 * @author NickFayne 2018-05-31 20:55
 */
//@ComponentScan(value = "com.nick",
//        useDefaultFilters = false,
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
@ComponentScan(value = "com.nick",
        useDefaultFilters = false,
        excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, value = MyFilterType.class)})
public class BeanConfig {

    @Bean("person")
    public Person person(){
        return new Person("NickFayne", 18);
    }
}
