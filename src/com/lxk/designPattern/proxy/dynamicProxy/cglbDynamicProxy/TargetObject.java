package com.lxk.designPattern.proxy.dynamicProxy.cglbDynamicProxy;

/**
 * 被代理的类
 * 目标对象类
 */
public class TargetObject {

    /**
     * 目标方法(即目标操作)
     */
    public void business() {
        System.out.println("business");
    }

}
