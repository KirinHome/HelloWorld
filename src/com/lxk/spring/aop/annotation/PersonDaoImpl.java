package com.lxk.spring.aop.annotation;

import com.google.common.collect.Lists;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lxk on 2016/11/28
 */
@Repository(value = "personDaoImpl")
public class PersonDaoImpl implements PersonDao {

    public void deletePerson() {
        System.out.println("delete perosn");
    }

    public List<Person> getPerson(String s) throws Exception {
        List<Person> personList = Lists.newArrayList();
        Person person1 = new Person();
        person1.setPid(1L);
        person1.setPname("person1");

        int a = 1 / 0;

        System.out.println("get person");
        personList.add(person1);
        Person person2 = new Person();
        person2.setPid(2L);
        person2.setPname("person2");
        personList.add(person2);
        return personList;
    }

    public void savePerson() {
        System.out.println("delete perosn");
    }

    public void updatePerson() {
        System.out.println("delete perosn");
    }

}
