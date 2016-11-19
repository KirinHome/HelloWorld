package com.lxk.aop;

/**
 * 目标对象类实现目标接口.
 * 继而实现目标方法。
 */
public class SalaryServiceImpl implements SalaryService {

    /**
     * 实现目标接口的目标方法(即目标操作)
     */
    @Override
    public void showSalary() {
        System.out.println("正在查看工资");
    }
}
