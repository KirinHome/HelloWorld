package com.lxk.spring.jdbc;

import java.util.List;

public interface PersonDao {
    void insertPerson();

    void updatePerson();

    void deletePerson();

    List<Person> getAllPerson();

    List<Person> getAllPersonByRowMapper();

    List<Person> getPersons();
}
