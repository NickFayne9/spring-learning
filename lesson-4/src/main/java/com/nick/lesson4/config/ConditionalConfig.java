package com.nick.lesson4.config;

import com.nick.lesson4.condition.WindowsCondition;
import com.nick.lesson4.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Conditional 配置类
 * @author NickFayne 2018-06-03 10:02
 */
@Configuration
//@Conditional({WindowsCondition.class})
public class ConditionalConfig {

    @Conditional({WindowsCondition.class})
    @Bean
    public Person person(){
        return new Person();
    }
}
