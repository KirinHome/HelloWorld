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
        //testResult();
        //testSplit();
        testOneNumber();
    }

    private static void testOneNumber() {
        Integer s = 2;
        int result = 0;
        String tempString;
        char[] temp;
        String one = "1";
        char oneChar = '1';
        for (Integer i = 1; i < s + 1; i++) {
            tempString = i.toString();
            temp = tempString.toCharArray();
            if (tempString.contains(one)) {
                for (char aTemp : temp) {
                    if (oneChar == aTemp) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
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
