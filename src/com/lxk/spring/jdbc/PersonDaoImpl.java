package com.lxk.spring.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonDaoImpl extends JdbcDaoSupport implements PersonDao {
    @Override
    public void insertPerson() {
        this.getJdbcTemplate().execute("INSERT INTO person VALUES (1,'王二麻子0','boy0','120','1100')");
        this.getJdbcTemplate().execute("INSERT INTO person VALUES(2,'王二麻子1','boy1','121','1101')");
        this.getJdbcTemplate().execute("INSERT INTO person VALUES(3,'王二麻子2','boy2','122','1102')");
    }

    @Override
    public void updatePerson() {
        this.getJdbcTemplate().execute("UPDATE person SET NAME = '王霸' WHERE id = 1");
    }

    @Override
    public void deletePerson() {
        this.getJdbcTemplate().execute("DELETE FROM person WHERE id = '1'");
    }

}
