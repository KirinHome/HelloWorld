package com.lxk.designPattern.singleton;

/**
 * 饿汉式--就是屌丝，穷，不给准备好，担心饿死。类加载就给准备好
 * <p>
 * Created by lxk on 2017/3/23
 */
public class SingletonPattern1 {
    private static SingletonPattern1 singletonInstance = new SingletonPattern1();

    private SingletonPattern1() {
    }

    public static SingletonPattern1 getSingletonInstance() {
        return singletonInstance;
    }
}