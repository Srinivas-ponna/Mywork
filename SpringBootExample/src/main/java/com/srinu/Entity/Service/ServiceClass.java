package com.srinu.Entity.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srinu.Entity.Person;
import com.srinu.Entity.Dao.PersonDao;

@Service
public class ServiceClass {

	@Autowired
	private PersonDao dao;
	
	public void savePerson(Person person){
	    dao.save(person);
	}
	public void updatePerson(Person person){
		dao.save(person);
		
	}
	public void deletePerson(Integer id){
		dao.deleteById(id);
	}
	
	public Person getPerson(Integer id){
		Optional<Person> optional = dao.findById(id);
		Person p = optional.get();
		return p;
		
	}
	
	public List<Person> getAll(Person person){
		return dao.findAll();
		
	}
}
