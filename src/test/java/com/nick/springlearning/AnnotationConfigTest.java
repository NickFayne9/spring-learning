package com.nick.springlearning;

import com.nick.springlearning.config.BeanConfig;
import com.nick.springlearning.model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解配置方式测试类
 * @author NickFayne 2018-05-31 20:55
 */
public class AnnotationConfigTest {

    @Test
    public void testAnnotationConfig(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
