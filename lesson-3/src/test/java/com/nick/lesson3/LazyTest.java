package com.nick.lesson3;

import com.nick.lesson3.config.LazyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author NickFayne 2018-06-03 9:13
 */
public class LazyTest {

    @Test
    public void testLazy(){
        System.out.println("---IOC 容器开始初始化---");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LazyConfig.class);
        System.out.println("---IOC 容器初始化完毕---");
        applicationContext.getBean("person");

    }
}
