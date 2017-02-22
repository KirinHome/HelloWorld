package com.lxk.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间相关的测试
 * <p>
 * Created by lxk on 2017/2/22
 */
public class TimeTest {
    public static void main(String[] args) {
        Date date = new Date();
        //Date aw = Calendar.getInstance().getTime();//获得时间的另一种方式，测试效果一样
        testTime(date);
    }

    /**
     * 将Date类型的时间转成 2016-10-25 18:11:55 此格式
     * 时间戳转换为 2016-10-25 18:11:55 此格式
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
