package com.lxk.threadTest.wayToThread;

/**
 * 线程测试（实现多线程的几种方式）
 * <p>
 * Created by lxk on 2016/11/12
 */
public class Main {
    public static void main(String[] args) {
        //newThreadWay1();
        //newThreadWay1_();
        //newThreadWay1__();
        newThreadWay2();
    }

    /**
     * 创建线程方式1实现(和上面稍微有点差别)
     * 实现Runnable接口，重写run方法
     */
    private static void newThreadWay1() {
        //一个类实现Runnable接口，可以方便扩展
        ThreadWay1 threadWay1 = new ThreadWay1();
        new Thread(threadWay1).start();
    }


    /**
     * 创建线程方式2实现
     * 继承Thread类，重写run函数
     */
    private static void newThreadWay2() {
        ThreadWay2 threadWay2 = new ThreadWay2();
        threadWay2.start();
        //new ThreadWay2().start();等于上面的2行代码
    }

    /**
     * 创建线程方式1实现(匿名对象：new个线程对象直接开启)
     * 实现Runnable接口，重写run方法
     */
    private static void newThreadWay1_() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {//死循环
                    try {
                        Thread.sleep(1000);//毫秒
                        System.out.println("thread1");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }

    /**
     * 创建线程方式1实现(实例化一个线程对象，然后调用start方法开启线程)
     * 实现Runnable接口，重写run方法
     */
    private static void newThreadWay1__() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {
                    try {
                        Thread.sleep(1000);//毫秒
                        System.out.println("thread1");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }
}