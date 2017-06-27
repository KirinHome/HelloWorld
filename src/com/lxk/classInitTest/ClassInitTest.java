package com.lxk.classInitTest;

/**
 * 测试Java类的成员和初始化块（代码块）初始化顺序
 * <p>
 * Created by lxk on 2017/4/20
 */
public class ClassInitTest {
    public static void main(String[] args) {
        System.out.println("测试代码开始");
        new Child();
        System.out.println("测试代码结束");
    }
}
