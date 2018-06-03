package com.nick.lesson5.model;

/**
 * 模型类 黄色
 * @author NickFayne 2018-06-03 15:54
 */
public class Yellow {
    private String name;

    public Yellow() {
    }

    public Yellow(String name) {
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
        return "Yellow{" +
                "name='" + name + '\'' +
                '}';
    }
}
