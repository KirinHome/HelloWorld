package com.lxk.reflect;

import com.lxk.reflect.classloaderAndForName.Line;

/**
 * 代码块执行顺序测试
 * <p>
 * Created by lxk on 2017/2/21
 */
public class CodeBlockTest {
    public static void main(String[] args) {
        System.out.println("主方法");
        Line line = new Line();
    }
}
