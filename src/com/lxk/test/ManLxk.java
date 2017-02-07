package com.lxk.test;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by lxk on 2017/2/7
 */
public class ManLxk extends Person {
    @Override
    protected List<String> say() {


        return Lists.newArrayList();
    }

    public static void main(String[] args) {
        testResult();
        testSplit();
    }

    private static void testSplit() {
        String ss = "aa,sas,sasa,sasas,,,";
        String[] array = ss.split(",");

        System.out.println(array.length);//结果是4，而不是预想中的7
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void testResult() {
        for (int i = 0; ; i++) {
            if (i % 2 == 1
                    && i % 3 == 0
                    && i % 4 == 1
                    && i % 5 == 4
                    && i % 6 == 3
                    && i % 7 == 4
                    && i % 8 == 1
                    && i % 9 == 0) {
                System.out.println(i);
                return;
            }
        }
    }

}
