package com.lxk.threadTest.multithreadCommunication.inOutDemo.bad;

/**
 * Created by lxk on 2017/6/27
 */
public class Output implements Runnable {
    private final Resources r;

    Output(Resources r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            synchronized ( r) {
                if (!r.flag) {
                    try {r.wait();} catch (Exception ignore) {}
                }
                System.out.println(r.name + "...." + r.sex);
                r.flag = false;
                r.notify();
            }
        }
    }
}