package com.lxk.threadTest.multithreadCommunication.producerConsumer.bad;

/**
 * Created by lxk on 2017/6/27
 */
public class Producer implements Runnable {
    private Resource res;

    Producer(Resource res) {
        this.res = res;
    }

    public void run() {
        while (true) {
            res.set("+商品+");
        }
    }
}
