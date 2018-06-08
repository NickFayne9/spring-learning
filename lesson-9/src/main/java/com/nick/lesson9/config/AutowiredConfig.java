package com.nick.lesson9.config;

import com.nick.lesson9.model.Blue;
import com.nick.lesson9.model.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Spring 自动装配配置类
 * @author NickFayne 2018-06-06 20:16
 */
@Configuration
@ComponentScan("com.nick.lesson9.model")
public class AutowiredConfig {

//    @Bean("red2")
//    //@Primary
//    //@Bean
//    public Red red(){
//        Red red = new Red();
//        red.setName("红色 2");
//        return red;
//    }

    @Bean("red")
    public Blue blue(){
        return new Blue();
    }
}
