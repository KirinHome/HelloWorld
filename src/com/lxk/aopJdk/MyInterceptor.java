package com.lxk.aopJdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 在jdk中，只要实现了InvocationHandler这个接口的类就是一个拦截器类
 * 作用：控制目标对象的目标方法的执行
 * @author Administrator
 * 拦截器的作用：
 *   *  引入类
 *    	1、引入目标类
 *    	2、引入安全性的类
 *    	3、引入日志类
 *    	4、引入权限类
 *   *  调用构造函数给对象赋值
 *   *  在invoke方法中把所以的逻辑结合在一起
 *
 */
public class MyInterceptor implements InvocationHandler{
	
	private Object target;//目标类
	
	private Privilege privilege;//权限类
	
	private Logger logger;//日志类
	
	private Security security;//安全类
	
	public MyInterceptor(Object target,Privilege privilege,Logger logger,Security security){
		this.target = target;
		this.privilege = privilege;
		this.logger = logger;
		this.security = security;
	}
	
	/**
	 * args 目标方法的参数
	 * method 目标方法
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("aaa");
		this.logger.logging();
		this.security.security();
		if(this.privilege.getAccess().equals("admin")){
			method.invoke(this.target, args);//调用目标类的目标方法
		}else{
			System.out.println("您没有该权限");
		}
		System.out.println("bbbbbbbbbbbbbbbbbb");
		return null;
	}

}
