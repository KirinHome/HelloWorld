package com.lxk.designPattern.singleton;

/**
 * 双重锁形式
 * 这个模式将同步内容下放到if内部，提高了执行的效率，不必每次获取对象时都进行同步，
 * 只有第一次才同步，创建了以后就没必要了。避免土豪模式下创建单例，可能存在的线程不安全问题。
 * <p>
 * Created by lxk on 2017/3/23
 */
public class SingletonPattern3 {
    private static SingletonPattern3 singletonInstance;

    private SingletonPattern3() {
    }

    public static SingletonPattern3 getSingletonInstance() {
        if (singletonInstance == null) {
            synchronized (SingletonPattern3.class) {
                if (singletonInstance == null) {
                    singletonInstance = new SingletonPattern3();
                }
            }
        }
        return singletonInstance;
    }
}
