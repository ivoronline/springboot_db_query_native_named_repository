package com.ivoronline.springboot_db_query_native_named_repository.controllers;

import com.ivoronline.springboot_db_query_native_named_repository.entities.Person;
import com.ivoronline.springboot_db_query_native_named_repository.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN PERSON INDEXED
  //================================================================
  @RequestMapping("ReturnPersonIndexed")
  Object returnPersonIndexedUsingRepository() {
    Object object = personRepository.findByNameAgeIndexed("John", 20);
    return object;
  }

  //================================================================
  // RETURN PERSON INDEXED
  //================================================================
  @RequestMapping("ReturnPersonNamed")
  Object returnPersonNamedUsingRepository() {
    Object object = personRepository.findByNameAgeNamed("John", 20);
    return object;
  }


}


