package com.lxk.threadTest.multithreadCommunication.producerConsumer.bad;

/**
 * Created by lxk on 2017/6/27
 */
public class Consumer implements Runnable {
    private Resource res;

    Consumer(Resource res) {
        this.res = res;
    }

    public void run() {
        while (true) {
            res.out();
        }
    }
}
