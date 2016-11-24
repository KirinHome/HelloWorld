package com.lxk.designPattern.decorator;

/**
 * 被装饰的类
 * (被增强对象)
 * <p>
 * Created by lxk on 2016/11/24
 */
public class PersonBefore implements Person {
    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
