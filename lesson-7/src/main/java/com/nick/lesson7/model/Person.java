package com.nick.lesson7.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 模型类 人
 * @author NickFayne 2018-06-05 20:17
 */
public class Person implements ApplicationContextAware {

    /**
     * IOC 容器
     */
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
