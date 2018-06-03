package com.nick.lesson4.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author NickFayne 2018-06-03 10:03
 */
public class WindowsCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //1. 能获取到 IOC 使用的 BeanFactory
        context.getBeanFactory();
        //2. 获取类加载器
        context.getClassLoader();
        //3. 获取环境变量信息（很重要）
        Environment environment = context.getEnvironment();
        //4. 获取 bean 定义的注册类
        context.getRegistry();
        //5. 获取
        context.getResourceLoader();

        //返回 true 则会被 IOC 创建；返回 false 则不会被创建
        //return false;

        if("Windows 10".equals(environment.getProperty("os.name"))){
            return true;
        }else{
            return false;
        }
    }
}
