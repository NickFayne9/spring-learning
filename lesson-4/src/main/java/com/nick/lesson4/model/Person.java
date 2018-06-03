package com.nick.lesson4.model;

/**
 * 模型类 人
 * @author NickFayne 2018-06-03 8:55
 */
public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("调用了 Person 默认的构造方法...");
    }

    public Person(String name, int age) {
        System.out.println("调用了 Person 两个参数的构造方法...");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
