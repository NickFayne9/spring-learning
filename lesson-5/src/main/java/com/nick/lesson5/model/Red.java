package com.nick.lesson5.model;

/**
 * 模型类 红色
 * @author NickFayne 2018-06-03 15:53
 */
public class Red {
    private String name;

    public Red() {
    }

    public Red(String name) {
        this.name = name;
    }

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
