package com.lxk.threadTest.ticket.extend;

/**
 * Created by lxk on 2017/6/25
 */
public class Ticket extends Thread {
    //private int ticket = 100;//创建一个对象就有100张票。错误一：几个线程都打印一次1-99。不合适。
    private static int ticket = 100;//静态变量是所有对象都共享，100张票。几个线程，卖的都是一个票。但是，一般都不这么干，静态变量，生命周期太长。

    public Ticket(String name) {
        super(name);
    }

    /**
     * 这地方就是需要注意的地方，如果不加[synchronized]，就会发生线程安全问题。
     * 奇怪了，
     * 怎么还是线程不安全，还是会执行出0，-1，-2。的结果出来。
     */
    @Override
    //public synchronized void run() {
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket > 0) {
                    //睡一下，好实现线程不安全的现象,前提是这个方法，没有添加synchronized，同步函数。
                    try {
                        Thread.sleep(10);
                    } catch (Exception ignored) {
                    }
                    System.out.println(this.getName() + " sale：" + ticket--);
                }
            }
        }
    }
}
