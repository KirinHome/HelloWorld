package com.lxk.threadTest.multithreadCommunication.inOutDemo.good;

/**
 * Created by lxk on 2017/6/27
 */
public class Input implements Runnable {
    private Resources r;

    Input(Resources r) {
        this.r = r;
    }

    public void run() {
        int x = 0;
        while (true) {
            if (x == 0) {
                r.set("mike", "man");
            } else {
                r.set("丽丽", "女女女女女");
            }
            x = (x + 1) % 2;
        }
    }
}
