package com.nick.lesson1;

import com.nick.lesson1.config.BeanConfig;
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

        String[] beans = applicationContext.getBeanDefinitionNames();
        for(String beanName : beans){
            System.out.println(beanName);
        }
    }
}
