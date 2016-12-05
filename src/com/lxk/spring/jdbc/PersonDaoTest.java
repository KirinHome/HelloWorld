package com.lxk.spring.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDaoTest {
    @Test
    public void testSave() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/lxk/spring/jdbc/applicationContext.xml");
        PersonDao personDao = (PersonDao) context.getBean("personDao");
        personDao.insertPerson();
    }

    @Test
    public void testUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/lxk/spring/jdbc/applicationContext.xml");
        PersonDao personDao = (PersonDao) context.getBean("personDao");
        personDao.updatePerson();
    }

    @Test
    public void testDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/lxk/spring/jdbc/applicationContext.xml");
        PersonDao personDao = (PersonDao) context.getBean("personDao");
        personDao.deletePerson();
    }
}
