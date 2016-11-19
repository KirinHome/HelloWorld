package com.lxk.aop;

/**
 * 代理对象类也实现目标接口
 * 继而实现目标方法。
 */
public class SalaryServiceProxy implements SalaryService {

    private Privilege privilege;
    private Logger logger;
    private Security security;
    private SalaryService target;

    public SalaryServiceProxy(Privilege privilege, Logger logger, Security security, SalaryService target) {
        this.privilege = privilege;
        this.logger = logger;
        this.security = security;
        this.target = target;
    }

    /**
     * 实现目标接口的目标方法(即目标操作)
     * 并对目标方法进行扩展
     */
    @Override
    public void showSalary() {
        this.logger.logging();
        this.security.security();
        if (this.privilege.getAccess().equals("admin")) {
            this.target.showSalary();//目标对象的目标方法
        } else {
            System.out.println("您没有该权限");
        }
    }
}
