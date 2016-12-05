package com.lxk.spring.jdbc;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class PersonDaoImpl extends JdbcDaoSupport implements PersonDao{

	public void insertPerson() {
		this.getJdbcTemplate().execute("insert into person values(1,'王二麻子','boy','12','110')");
	}

}
