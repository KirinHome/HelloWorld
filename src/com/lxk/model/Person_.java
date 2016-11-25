package com.lxk.model;

/**
 * 测试model集合按某属性排序
 * <p>
 * Created by lxk on 2016/11/25
 */
public class Person_ {
    private int age;
    private String name;

    public Person_(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}