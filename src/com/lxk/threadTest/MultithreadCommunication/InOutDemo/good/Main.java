package com.lxk.threadTest.MultithreadCommunication.InOutDemo.good;

/**
 * 两个线程，一个负责写，一个负责读，交互着来。
 * （优化过后的代码，看着精炼。）
 * <p>
 * Created by lxk on 2017/6/27
 */
public class Main {
    public static void main(String[] args) {
        Resources r = new Resources();
        new Thread(new Input(r)).start();
        new Thread(new Output(r)).start();
    }
}
