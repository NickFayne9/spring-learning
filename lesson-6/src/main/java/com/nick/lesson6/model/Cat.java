package com.nick.lesson6.model;

/**
 * 模型类 猫
 * @author NickFayne 2018-06-04 20:33
 */
public class Cat {

    public Cat() {
        System.out.println("猫的构造方法");
    }

    public void init(){
        System.out.println("猫的 init 初始化方法");
    }

    public void destroy(){
        System.out.println("猫的 destroy 销毁方法");
    }
}
