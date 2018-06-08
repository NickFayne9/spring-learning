package com.nick.lesson6;

import com.nick.lesson6.config.InitDestroyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testList(){
        List<String> strList = new ArrayList<String>();
        strList.remove("1");
        strList.add("1");
        strList.remove("2");
        strList.add("2");
        strList.remove("3");
        strList.add("3");

        System.out.println(strList);
    }
}
