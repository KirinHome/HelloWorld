package com.lxk.designPattern.singleton;

/**
 * 饱汉式----就是有钱，豪，用的时候再new
 * <p>
 * Created by lxk on 2017/3/23
 */
public class SingletonPattern2 {
    private static SingletonPattern2 singletonInstance;

    private SingletonPattern2() {
    }

    public static SingletonPattern2 getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonPattern2();
        }
        return singletonInstance;
    }
}
