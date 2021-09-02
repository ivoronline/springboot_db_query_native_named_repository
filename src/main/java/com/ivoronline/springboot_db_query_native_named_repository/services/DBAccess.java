package com.ivoronline.springboot_db_query_native_named_repository.services;

import com.ivoronline.springboot_db_query_native_named_repository.entities.Person;
import com.ivoronline.springboot_db_query_native_named_repository.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DBAccess {

  @Autowired PersonRepository personRepository;

  //================================================================
  // INSERT PERSON
  //================================================================
  @Transactional
  public Integer insertPerson() {
    Integer insertedRecords = personRepository.insertPerson("John", 20);
    return  insertedRecords;
  }

  //================================================================
  // SELECT PERSON BY NAME AGE
  //================================================================
  public Person selectPersonByNameAge() {
    Person person = personRepository.selectPersonByNameAge("John", 20);
    return person;
  }

  //================================================================
  // UPDATE PERSON
  //================================================================
  @Transactional
  public Integer updatePerson() {
    Integer updatedRecords = personRepository.updatePerson("John", 200);
    return  updatedRecords;
  }

  //================================================================
  // DELETE PERSON
  //================================================================
  @Transactional
  public Integer deletePerson() {
    Integer deletedRecords = personRepository.deletePerson("John");
    return  deletedRecords;
  }

}
