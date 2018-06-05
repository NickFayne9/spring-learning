package com.nick.lesson8;

import com.nick.lesson8.config.PropertyValueConfig;
import com.nick.lesson8.model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * PropertySource Value 注解 测试类
 * @author NickFayne 2018-06-05 20:36
 */
public class PropertyValueTest {

    @Test
    public void testPropertyValue(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertyValueConfig.class);

        Person person = applicationContext.getBean(Person.class);

        System.out.println(person);
    }
}
