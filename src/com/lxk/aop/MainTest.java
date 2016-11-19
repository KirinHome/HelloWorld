package com.lxk.aop;

/**
 * AOP代理测试
 */
public class MainTest {
    public static void main(String[] args) {
        Logger logger = new Logger();//日志
        Security security = new Security();//安全性
        Privilege privilege = new Privilege();//权限
        privilege.setAccess("admin");

        SalaryService proxy = new SalaryServiceProxy(privilege, logger, security, new SalaryServiceImpl());
        proxy.showSalary();

    }
}
