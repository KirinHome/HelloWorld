package com.lxk.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
