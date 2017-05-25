package com.lxk.test;

import com.lxk.model.TimeFormatModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间相关的测试
 * <p>
 * Created by lxk on 2017/2/22
 */
public class TimeTest {
    public static void main(String[] args) {
        //Date date = new Date();
        //Date aw = Calendar.getInstance().getTime();//获得时间的另一种方式，测试效果一样
        //testTime(date);
        //long a = System.currentTimeMillis();
        //System.out.println(t.toString());
        //System.out.println("\r<br> 执行耗时 : " + (System.currentTimeMillis() - a) / 1000f + " 秒 ");
        //testCalendar();
        testStringToDate();
    }

    private static void testStringToDate() {
        String s = "2017-05-25";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(s);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(date);
    }


    /**
     * 查看 Calendar 获得年月日时分秒
     */
    private static void testCalendar() {
        //1490084570

        Date ping = new Date(1490084570000L);
        Calendar cal = Calendar.getInstance();
        TimeFormatModel t = new TimeFormatModel();
        t.setDate(cal.getTime());
        System.out.println(t.toString());
        t.setDate(ping);
        System.out.println(t.toString());
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + 1);
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

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
