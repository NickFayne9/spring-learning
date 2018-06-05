package com.nick.lesson8.model;

import org.springframework.beans.factory.annotation.Value;

/**
 * 模型类 人
 * @author NickFayne 2018-06-05 20:32
 */
public class Person {
    @Value("NickFayne")
    private String name;

    @Value("#{20-2}")
    private Integer age;

    @Value("${person.nickname}")
    private String nickname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
