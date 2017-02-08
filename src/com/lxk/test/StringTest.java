package com.lxk.test;

/**
 * Created by lxk on 2017/2/8
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = "ab" + "c";
        System.out.println("a == b " + (a == b));
        System.out.println("a == c " + (a == c));
        System.out.println("a == d " + (a == d));
        System.out.println("b == c " + (b == c));
        System.out.println("b == d " + (b == d));
        System.out.println("c == d " + (c == d));
        System.out.println("-----------------");
        System.out.println("abc" == ("ab" + "c"));
    }
}
