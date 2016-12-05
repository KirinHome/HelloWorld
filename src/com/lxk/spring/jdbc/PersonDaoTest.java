package com.lxk.spring.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDaoTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lxk/spring/jdbc/applicationContext.xml");
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		personDao.insertPerson();
	}
}
