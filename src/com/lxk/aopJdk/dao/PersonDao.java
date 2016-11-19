package com.lxk.aopJdk.dao;

import java.util.List;

public interface PersonDao {
	public void savePerson();
	public void updatePerson();
	public void deletePerson();
	public List<Person> getPerson();
}
