package com.nick.lesson1;

import com.nick.lesson1.model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XML 文件配置方式测试类
 * @author NickFayne 2018-05-31 20:40
 */
public class ClassPathXmlTest {

    @Test
    public void testXML(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
