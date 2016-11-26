package com.lxk.spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 原理：
 *    当启动spring容器的时候，
 *       *  会把纳入spring容器的bean实例化
 *       *  spring容器会解析配置文件中的
 *                <aop:config>,从而解析aop:config下的切入点表达式
 *       *  解析出来以后就会在spring容器的bean中查找
 *              是否有类符合切入点表达式，如果符合，则为这个对象创建代理对象
 *       *  客户端根据bean的id寻找一个bean,如果该bean有代理对象，则返回代理对象，如果没有代理对象则
 *          返回bean的对象
 * @author Administrator
 *
 */
public class AOPXMLTest {
	@Test
	public void test() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lxk/spring/aop/applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.getPerson();
	}
}
