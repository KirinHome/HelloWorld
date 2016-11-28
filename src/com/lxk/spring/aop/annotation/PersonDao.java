package com.lxk.spring.aop.annotation;

import java.util.List;

public interface PersonDao {
    void deletePerson();
    List<Person> getPerson() throws Exception;
    void savePerson();
    void updatePerson();
}
