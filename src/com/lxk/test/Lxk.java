package com.lxk.test;

import com.lxk.model.CodeBlockModel;
import com.lxk.model.Dog;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Created by lxk on 2016/11/8
 */
public class Lxk {
    public static void main(String[] args) {
        String order = "1128";
        if (!order.equals("1128")) {
            testTypeCast();
            simpleTest();
            testJavaBeanArray();
        } else {
            testCodeBlock();
        }
    }

    /**
     * 测试代码块的执行
     * {@link CodeBlockModel#name}
     */
    private static void testCodeBlock() {
        CodeBlockModel codeBlockModel1 = new CodeBlockModel();
        CodeBlockModel codeBlockModel2 = new CodeBlockModel("cms","18","student");

    }

    /**
     * 测试对象数组的默认情况
     */
    private static void testJavaBeanArray() {
        Dog[] dogs = new Dog[10];
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

    private static void testTypeCast() {
        float scale = 34.236323F;
        DecimalFormat fnum = new DecimalFormat("##0.00");
        long num = 1;
        float result = ((float) num) / (1024L * 1024L * 1024L);
        String dd = fnum.format(result);
        System.out.println(dd);

        //BigDecimal b = new BigDecimal(result);
        //float f1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
        //System.out.println(f1);
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
