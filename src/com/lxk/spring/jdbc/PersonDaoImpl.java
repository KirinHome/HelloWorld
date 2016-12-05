package com.lxk.spring.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

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

    /**
     * spring结合jdbc返回map
     */
    @Override
    public List<Person> getAllPerson() {
        String opString = "SELECT * FROM person";
        /*
         *查询结果是一个map
         */
        List listOfMap = this.getJdbcTemplate().queryForList(opString);
        /*
         *查询结果是一个map,但是却不能正确执行。
         */
        List listOfList = this.getJdbcTemplate().queryForList(opString, Person.class);
        System.out.println(listOfMap);
        System.out.println(listOfList);
        return null;
    }

    /**
     * spring结合jdbc返回list
     */
    @Override
    public List<Person> getAllPersonByRowMapper() {
        String opString = "SELECT * FROM person";
        List listOfList = this.getJdbcTemplate().query(opString, new PersonRowMapper());
        System.out.println(listOfList);
        return null;
    }

    /**
     * 条件查询(字段和参数按位置匹配)
     */
    @Override
    public List<Person> getPersons() {
        String opString = "SELECT * FROM person WHERE id = ? AND NAME = ?";
        List list = this.getJdbcTemplate().query(opString, new Object[]{2,"王二麻子1"}, new PersonRowMapper());
        System.out.println(list);
        return null;
    }

}
