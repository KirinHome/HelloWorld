package com.lxk.spring.aop.xml;

import java.util.List;

/**
 * 目标对象和代理对象都实现的接口
 */
public interface PersonDao {
    void deletePerson();
    List<Person> getPerson() throws Exception;
    void savePerson();
    void updatePerson();
}
