package com.lxk.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试 SimpleDateFormat 声明为静态变量能在toString中使用吗
 *
 * Created by lxk on 2017/2/28
 */
public class TimeFormatModel {
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date;


    public TimeFormatModel() {
    }

    public TimeFormatModel(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TimeFormatModel{" +
                "data=" + formatTime() +
                '}';
    }

    private String formatTime() {
        return format.format(date.getTime());
    }
}
