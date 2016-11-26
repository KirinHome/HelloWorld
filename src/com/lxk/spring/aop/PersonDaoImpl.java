package com.lxk.spring.aop;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 目标对象:实现目标接口
 */
public class PersonDaoImpl implements PersonDao {

    @Override
    public void deletePerson() {
        System.out.println("delete perosn");
    }

    @Override
    public List<Person> getPerson() throws Exception {
        List<Person> personList = Lists.newArrayList();
        Person person1 = new Person();
        person1.setPid(1L);
        person1.setPname("person1");
        System.out.println("get person");
        personList.add(person1);
        Person person2 = new Person();
        person2.setPid(2L);
        person2.setPname("person2");
        personList.add(person2);
        return personList;
    }

    @Override
    public void savePerson() {
        System.out.println("delete perosn");
    }

    @Override
    public void updatePerson() {
        System.out.println("delete perosn");
    }

}
