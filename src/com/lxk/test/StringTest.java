package com.lxk.test;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 字符串测试Class
 * <p>
 * Created by lxk on 2017/2/8
 */
public class StringTest {
    public static void main(String[] args) {
        String transmitValue = "初始值";
        List<String> list = Lists.newArrayList();
        list.add("0");
        testTransmitValue(transmitValue,list) ;
        System.out.println(transmitValue);
        System.out.println(list.toString());
        //testStringPool();
    }

    /**
     * 测试字符串和集合在函数之间的传值问题,解决值传递和地址传递的疑惑.
     */
    private static void testTransmitValue(String transmitValue, List<String> list) {
        transmitValue += "修改的痕迹";
        list.add("1");
        list.add("2");
        list.add("3");
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
        /*
            Java中字符串对象创建有两种形式。
            一种为字面量形式，如String str = "droid";，
            另一种就是使用new这种标准的构造对象的方法，如String str = new String("droid");
            这两种方式我们在代码编写时都经常使用，尤其是字面量的方式。然而这两种实现其实存在着一些性能和内存占用的差别。
            这一切都是源于JVM为了减少字符串对象的重复创建，其维护了一个特殊的内存，这段内存被成为字符串常量池或者字符串字面量池。
            工作原理
            当代码中出现字面量形式创建字符串对象时，JVM首先会对这个字面量进行检查。
            如果字符串常量池中存在相同内容的字符串对象的引用，则将这个引用返回。
            否则新的字符串对象被创建，然后将这个引用放入字符串常量池，并返回该引用。
         */
    }
}
