package com.lxk.threadTest.ticket.implement;

/**
 * Created by lxk on 2017/6/25
 */
public class Ticket implements Runnable {
    private int tick = 1000;

    public void run() {
        while (true) {
            synchronized (this) {
                if (tick > 0) {
                    try{Thread.sleep(10);}catch(Exception ignore){}
                    System.out.println(Thread.currentThread().getName() + "....sale : " + tick--);
                }
            }
        }
    }
}
