package com.lxk.test;

/**
 * 字符串测试Class
 * <p>
 * Created by lxk on 2017/2/8
 */
public class StringTest {
    public static void main(String[] args) {
        testStringPool();
    }

    /**
     * 测试字符串常量池的问题
     */
    private static void testStringPool() {
        String a = "abc";//字面量形式
        String b = "abc";//字面量形式
        String c = new String("abc");//使用new标准的构造对象
        /*
            注意：这个虽然看起来似乎要在常量池新建三个字符串对象：ab，c，和拼接生成的abc
            但是结果是内存中仅有生成的，前面的两个算是过程变量。这反编译得出来的结论，我没测试哟！
            这样做实际上是一种优化，避免了创建多余的字符串对象，也没有发生字符串拼接问题
         */
        String d = "ab" + "c";//字面量形式
        System.out.println("a == b " + (a == b));
        System.out.println("a == c " + (a == c));
        System.out.println("a == d " + (a == d));
        System.out.println("b == c " + (b == c));
        System.out.println("b == d " + (b == d));
        System.out.println("c == d " + (c == d));
        System.out.println("-----------------");
        System.out.println("abc" == ("ab" + "c"));
        System.out.println("-----------------");
        String e = c.intern();//将new出来的字符串对象加入字符串常量池
        System.out.println(a == e);
    }
}
