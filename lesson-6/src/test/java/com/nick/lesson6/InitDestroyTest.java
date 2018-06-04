package com.nick.lesson6;

import com.nick.lesson6.config.InitDestroyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 初始化，销毁方法 测试类
 * @author NickFayne 2018-06-04 20:40
 */
public class InitDestroyTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(InitDestroyConfig.class);
        System.out.println("容器创建完毕...");

        System.out.println(applicationContext.getBean("dog"));
        System.out.println(applicationContext.getBean("dog"));

        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
