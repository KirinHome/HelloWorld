package com.lxk.aopJdk.dao;

import java.lang.reflect.Proxy;

import java.util.List;

import org.junit.Test;

public class PersonTest {
	@Test
	public void test(){
		Transaction transaction = new Transaction();
		PersonDao target = new PersonDaoImpl();
		MyInterceptor interceptor = new MyInterceptor(target,transaction);
		PersonDao proxy = (PersonDao)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), interceptor);
		List<Person> personList = proxy.getPerson();
		for(Person person:personList){
			System.out.println(person.getPname());
		}
	}
}
