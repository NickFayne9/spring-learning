package com.nick.lesson9.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * 模型类 颜色
 * @author NickFayne 2018-06-06 20:19
 */
@Component
public class Color {

    //@Qualifier("red2")
    //@Autowired
    //@Resource
    //@Inject
    private Red red;

    public Color() {
        System.out.println("--------- 调用 Color 的无参构造方法 --------");
    }


    public Color(Red red) {
        System.out.println("--------- 调用 Color 的有参构造方法 --------");
        this.red = red;
    }

    public Red getRed() {
        return red;
    }


    @Autowired
    public void setRed( Red red) {
        System.out.println("--------- 调用 Color 的 setter --------");
        this.red = red;
    }


    @Override
    public String toString() {
        return "Color{" +
                "red2=" + red +
                '}';
    }
}
