package com.nick.lesson7;

import com.nick.lesson7.config.AwareConfig;
import com.nick.lesson7.model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Aware 测试类
 * @author NickFayne 2018-06-05 20:23
 */
public class AwareTest {

    @Test
    public void testAware(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person.getApplicationContext() == applicationContext);
    }
}
