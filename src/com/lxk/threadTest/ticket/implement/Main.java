package com.lxk.threadTest.ticket.implement;

/**
 * 卖票例子（实现Runnable接口，实现多线程）
 * <p>
 * Created by lxk on 2017/6/25
 */
public class Main {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
