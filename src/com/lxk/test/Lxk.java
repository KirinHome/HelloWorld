package com.lxk.test;

import java.util.List;

/**
 * Created by lxk on 2016/11/8
 */
public class Lxk {
    public static void main(String[] args) {
        String order = "1128";
        if (order.equals("1128")) {
            testTypeCast();
        } else {
            simpleTest();
        }
    }

    private static void testTypeCast() {
        long num = 8235098112L;
        float result = ((float) num)/(1024L * 1024L * 1024L);
        System.out.println(result);
    }

    private static void simpleTest() {
        String aw = "";
        String[] aaa = aw.split(",");
        System.out.println(aaa.length);
        System.out.println("------------------");

        System.out.println(1/10);
        String s = "bbbaaa";
        System.out.println(s.replace("*",".*"));
        List<String> ss = null;
        String qw = -1 > 0 ? "true" :"false";

        System.out.println(qw);
    }
}
