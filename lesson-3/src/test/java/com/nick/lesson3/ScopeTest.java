package com.nick.lesson3;

import com.nick.lesson3.config.ScopeConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试 Scope 类
 * @author NickFayne 2018-06-03 8:59
 */
public class ScopeTest {

    @Test
    public void testScope(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeConfig.class);
        System.out.println(applicationContext.getBean("person").hashCode());
        System.out.println(applicationContext.getBean("person").hashCode());
        String[] beans = applicationContext.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println(bean);
        }
    }
}
