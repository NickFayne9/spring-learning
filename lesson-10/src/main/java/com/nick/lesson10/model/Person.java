package com.nick.lesson10.model;

import org.springframework.stereotype.Component;

/**
 * 模型类 人
 * @author NickFayne 2018-06-07 21:14
 */
@Component
public class Person {

    public int div(int i, int j){
        System.out.println("做除法中 ");
        int res = i / j;
        return i;
    }
}
