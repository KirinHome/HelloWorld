package com.lxk.reflect;

/**
 * Created by lxk on 2017/2/21
 */
public class Line {
    static {
        System.out.println("静态代码块执行：loading line");
    }

    {
        System.out.println("要是普通的代码块呢？");
    }

    public Line() {
        System.out.println("构造方法执行");
    }
}
