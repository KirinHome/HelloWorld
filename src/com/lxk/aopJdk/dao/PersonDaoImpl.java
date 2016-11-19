package com.lxk.aopJdk.dao;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao{

	public void deletePerson() {
		// TODO Auto-generated method stub
		System.out.println("delete person");
	}
	public List<Person> getPerson() {
		// TODO Auto-generated method stub
		List<Person> personList = new ArrayList<Person>();
		Person person1 = new Person();
		person1.setPid(1L);
		person1.setPname("person1");
		personList.add(person1);
		Person person2 = new Person();
		person2.setPid(2L);
		person2.setPname("person2");
		personList.add(person2);
		return personList;
	}

	public void savePerson() {
		// TODO Auto-generated method stub
		System.out.println("save person");
	}

	public void updatePerson() {
		// TODO Auto-generated method stub
		System.out.println("update person");
	}

}
