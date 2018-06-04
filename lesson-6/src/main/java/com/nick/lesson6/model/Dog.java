package com.nick.lesson6.model;

/**
 * 模型类 狗
 * @author NickFayne 2018-06-04 20:33
 */
public class Dog {

    public Dog(){
        System.out.println("狗的构造器");
    }

    public void init(){
        System.out.println("狗的 init 初始化方法");
    }

    public void destroy(){
        System.out.println("狗的 destroy 销毁方法");
    }
}
