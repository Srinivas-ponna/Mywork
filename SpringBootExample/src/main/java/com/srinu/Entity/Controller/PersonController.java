package com.srinu.Entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srinu.Entity.Person;
import com.srinu.Entity.Service.ServiceClass;

@RestController
@RequestMapping("person")
@CrossOrigin
public class PersonController {
	
	@Autowired
	private ServiceClass service;
	
	@PostMapping
	public ResponseEntity<String> savePerson(@RequestBody Person person){
		service.savePerson(person);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	@PutMapping
	public ResponseEntity<String> updatePerson(@RequestBody Person person){
		service.updatePerson(person);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Person> getById(@PathVariable Integer id){
		service.getPerson(id);
		return new ResponseEntity<Person>(service.getPerson(id),HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<Person> getAll(@RequestBody Person person){

		service.getAll(person);
		return new ResponseEntity<Person>(HttpStatus.OK);
	}	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Person> deletePerson(@PathVariable Integer id){
		service.deletePerson(id);
		return new ResponseEntity<Person>(HttpStatus.OK);
	}
}
