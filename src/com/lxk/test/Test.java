package com.lxk.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lxk on 2016/10/25
 *
 * 时间戳转换为 2016-10-25 18:11:55 此格式
 */
class Test {
    public static void main(String[] args) {
        String color = "ss";
        switch (color) {
            case "ss":
                System.out.println("ss");
                break;
            case "yy":
                System.out.println("yy");
                break;
            case "qq":
                System.out.println("qq");
                break;

            default:
                System.out.println("default");
        }

        Date ss = new Date();
        //Date aw = Calendar.getInstance().getTime();//获得时间的另一种方式，测试效果一样
        testTime(ss);
    }

    /**
     * 将Date类型的时间转成 2016-10-25 18:11:55 此格式
     *
     * @param ss Date类型的时间
     */
    private static void testTime(Date ss) {
        System.out.println(ss);//打印一般的Date类型的时间
        System.out.println(ss.getTime());//这个是把当前时间转换成秒数，即时间戳。
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(ss.getTime());//这个就是把时间戳经过处理得到期望格式的时间
        System.out.println(time);

    }
}