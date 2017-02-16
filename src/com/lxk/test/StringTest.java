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
        String transmitValueNew = new String("new 出来的字符串");
        Integer integer = 100;
        List<String> list = Lists.newArrayList();
        list.add("0");
        testTransmitValue(transmitValue, transmitValueNew, list, integer);
        System.out.println(transmitValue);
        System.out.println(transmitValueNew);
        System.out.println(list.toString());
        System.out.println(integer);
        //testStringPool();
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
}
