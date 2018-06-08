package com.nick.lesson9.model;

/**
 * 模型类 蓝色
 * @author NickFayne 2018-06-08 22:55
 */
public class Blue {

    private String name = "蓝色";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Blue{" +
                "name='" + name + '\'' +
                '}';
    }
}
