package com.nick.lesson10;

import com.nick.lesson10.config.AopConfig;
import com.nick.lesson10.model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AOP 测试类
 * @author NickFayne 2018-06-07 20:50
 */
public class AopTest {

    @Test
    public void testAop(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        person.div(1, 2);
    }
}
