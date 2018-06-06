package com.nick.lesson9;

import com.nick.lesson9.config.AutowiredConfig;
import com.nick.lesson9.model.Color;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring 自动装配 测试类
 * @author NickFayne 2018-06-06 20:20
 */
public class AutowiredTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutowiredConfig.class);
        Color color = (Color) applicationContext.getBean("color");

        System.out.println(color);

        System.out.println("---------- IOC 容器中所有的 Bean ------------");
        String[] beans = applicationContext.getBeanDefinitionNames();
        for(String bean : beans){
            System.out.println(bean);
        }
    }
}
