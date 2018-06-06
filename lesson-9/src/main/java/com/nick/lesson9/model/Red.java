package com.nick.lesson9.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 模型类 红色
 * @author NickFayne 2018-06-06 20:19
 */
@Component
public class Red {

    private String name = "红色 1";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Red{" +
                "name='" + name + '\'' +
                '}';
    }
}
