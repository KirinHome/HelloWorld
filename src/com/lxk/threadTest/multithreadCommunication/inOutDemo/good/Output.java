package com.lxk.threadTest.multithreadCommunication.inOutDemo.good;

/**
 * Created by lxk on 2017/6/27
 */
public class Output implements Runnable {
    private Resources r;

    Output(Resources r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            r.out();
        }
    }
}