package com.lxk.threadTest;

/**
 * 线程测试
 * <p>
 * Created by lxk on 2016/11/12
 */
public class ThreadTest {
    public static void main(String[] args) {
        //newThreadWay1();
        //newThreadWay1_();
        //newThreadWay1__();
        newThreadWay2();
    }

    /**
     * 创建线程方式1实现()
     * 实现Runnable接口，重写run方法
     */
    private static void newThreadWay1() {
        //匿名对象：new个线程对象直接开启
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
     * 创建线程方式1实现(和上面稍微有点差别)
     * 实现Runnable接口，重写run方法
     */
    private static void newThreadWay1_() {
        //实例化一个线程对象，然后调用start方法开启线程
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

    /**
     * 创建线程方式1实现(和上面稍微有点差别)
     * 实现Runnable接口，重写run方法
     */
    private static void newThreadWay1__() {
        //一个类实现Runnable接口，可以方便扩展
        new Thread(new ThreadWay1()).start();
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
}

/**
 * 创建线程方式1实现
 * 实现Runnable接口，重写run方法
 */
class ThreadWay1 implements Runnable {
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
}

/**
 * 创建线程方式2实现
 * 继承Thread类，重写run函数
 */
class ThreadWay2 extends Thread {
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
}
