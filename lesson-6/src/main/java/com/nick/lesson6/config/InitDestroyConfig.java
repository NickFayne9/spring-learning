package com.nick.lesson6.config;

import com.nick.lesson6.beanPostProcessor.MyBeanPostProcessor;
import com.nick.lesson6.model.Cat;
import com.nick.lesson6.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Spring 配置类
 * @author NickFayne 2018-06-04 20:32
 */
@Configuration
public class InitDestroyConfig {

    @Bean(initMethod = "init", destroyMethod = "myDestroy")
    public Cat cat(){
        return new Cat();
    }

    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "myDestroy")
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

}
