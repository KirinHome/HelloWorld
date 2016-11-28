package com.lxk.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.ArrayList;
import java.util.List;

/**
 * 切面(spring aop 就不需要拦截器啦)
 * (模拟hibernate里面保存数据要打开事物，然后各种增删改之后，再提交事物。)
 */
public class Transaction {

    public void beginTransaction() {//前置通知
        //打开事物
        System.out.println("begin Transaction");
    }

    /**
     * @param joinPoint 通过joinPoint可以得到目标类和目标方法的一些信息
     * @param val       目标方法的返回值
     *                  和<aop:after-returning returning="val"/>中returning的值保质一致
     */
    public void commit(JoinPoint joinPoint, Object val) {//后置通知
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName);
        System.out.println(joinPoint.getTarget().getClass().getName());
        //提交事物
        System.out.println("commit");
        List<Person> personList = (ArrayList<Person>) val;
        for (Person person : personList) {
            System.out.println(person.getPname());
        }
    }

    /**
     * 最终通知
     */
    public void finalMethod() {
        System.out.println("最终通知");
    }

    /**
     * 环绕通知
     */
    public void aroundMethod(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("around method");
            joinPoint.proceed();//调用目标类的目标方法
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 异常通知
     */
    public void throwingMethod(Throwable except) {
        System.out.println(except.getMessage());
    }
}
