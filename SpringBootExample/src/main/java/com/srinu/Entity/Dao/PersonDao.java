package com.srinu.Entity.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srinu.Entity.Person;
@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
