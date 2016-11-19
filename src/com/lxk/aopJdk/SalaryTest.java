package com.lxk.aopJdk;

import org.junit.Test;

import java.lang.reflect.Proxy;
/**
 * 1、代理对象是由谁产生的？jvm产生的
 * 2、代理对象实现了什么接口？实现了SalaryService接口
 * 3、代理对象的方法体是什么？
 *      代理对象的方法体中的内容就是拦截器中invoke方法中的内容
 * 4、拦截器中的invoke方法中的method参数是在什么时候赋值的？
 *      在客户端，代理对象调用方法实际上进入的是拦截器中的invoke方法，这个时候
 *      拦截器中的invoke方法中的method参数会被赋值
 * @author Administrator
 *
 */
public class SalaryTest {
	@Test
	public void test(){
		Logger logger = new Logger();
		Security security = new Security();
		Privilege privilege = new Privilege();
		privilege.setAccess("aaa");
		SalaryService target = new SalaryServiceImpl();//目标对象
		MyInterceptor interceptor = new MyInterceptor(target,privilege,logger,security);
		/**
		 * 参数：
		 * 	1、目标类的类加载器
		 * 	2、目标类的所有的接口
		 *  3、拦截器
		 */
		SalaryService salaryService = (SalaryService)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), interceptor);
		
		salaryService.showSalary();
	}
}
