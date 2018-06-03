package com.nick.lesson4;

import com.nick.lesson4.config.ConditionalConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Conditional 测试类
 * @author NickFayne 2018-06-03 10:01
 */
public class ConditionalTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConditionalConfig.class);

        String[] beans = applicationContext.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println(bean);
        }
    }
}
