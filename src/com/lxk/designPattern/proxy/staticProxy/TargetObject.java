package com.lxk.designPattern.proxy.staticProxy;

/**
 * 被代理对象
 * 目标对象类
 * 实现目标接口.
 * 继而实现目标方法。
 */
public class TargetObject implements TargetInterface {

    /**
     * 目标方法(即目标操作)
     */
    @Override
    public void business() {
        System.out.println("business");
    }

}
