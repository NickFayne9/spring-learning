package com.nick.lesson6.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 模型类 狗
 * @author NickFayne 2018-06-04 20:33
 */
public class Dog implements InitializingBean, DisposableBean {

    public Dog(){
        System.out.println("狗的构造方法");
    }

    public void init(){
        System.out.println("狗的 init 初始化方法");
    }

    public void myDestroy(){
        System.out.println("狗的 myDestroy 销毁方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("狗的 InitializingBean.afterPropertiesSet 销毁方法");
    }

    public void destroy() throws Exception {
        System.out.println("狗的 DisposableBean.destroy 销毁方法");
    }
}
