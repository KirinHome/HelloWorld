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
        if (false) {
            testValueAndAddressTransmit();
            testStringBufferAndStringBuilder();
            testStringNewLine();
            testSplit();
            testStringPool2();
        } else {
            testStringPool();
        }
    }

    /**
     * 还是测试字符串 ==
     */
    private static void testStringPool2(){
        String s1 = "a";
        String s3 = "a" + "b";
        String s2 = s1 + "b";
        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
    }

    /**
     * 测试字符串的 split()
     */
    private static void testSplit() {
        String ss = "aa,sas,sasa,sasas,,,";
        String[] array = ss.split(",");

        System.out.println(array.length);//结果是4，而不是预想中的7
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 测试代码中的换行："\r\n"和<br>
     */
    private static void testStringNewLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("大").append("\r\n");
        }
        System.out.println(sb.toString());
    }

    /**
     * StringBuffer和StringBuilder的使用
     */
    private static void testStringBufferAndStringBuilder() {
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            sbf.append("这是第").append(i).append("个; ");
        }
        System.out.println(sbf);
        System.out.println(sbf.indexOf("7"));
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sbd.append("这是第").append(i).append("个; ");
        }
        System.out.println(sbd);
        System.out.println(sbd.indexOf("7"));
    }

    /**
     * 测试值传递和地址传递
     */
    private static void testValueAndAddressTransmit() {
        String transmitValue = "初始值";
        String transmitValueNew = new String("new 出来的字符串");
        Integer integer = 100;
        List<String> list = Lists.newArrayList();
        list.add("0");
        testTransmitValue(transmitValue, transmitValueNew, list, integer);
        System.out.println(transmitValue);
        System.out.println(transmitValueNew);
        System.out.println(list.toString());
        System.out.println(integer);
    }

    /**
     * 测试字符串和集合在函数之间的传值问题,解决值传递和地址传递的疑惑.
     */
    private static void testTransmitValue(String transmitValue, String transmitValueNew, List<String> list, Integer integer) {
        transmitValue += "修改的痕迹";
        transmitValueNew += "assss修改的痕迹";
        list.add("1");
        list.add("2");
        list.add("3");
        integer = 9999;
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
        System.out.println("a == b " + (a == b));//true
        System.out.println("a == c " + (a == c));//false
        System.out.println("a == d " + (a == d));//true
        System.out.println("b == c " + (b == c));//false
        System.out.println("b == d " + (b == d));//true
        System.out.println("c == d " + (c == d));//false
        System.out.println("-----------------");
        System.out.println("abc" == ("ab" + "c"));//true
        System.out.println("-----------------");
        String e = c.intern();//将new出来的字符串对象加入字符串常量池
        System.out.println(a == e);//true
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
