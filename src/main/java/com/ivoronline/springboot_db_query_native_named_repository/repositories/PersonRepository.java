package com.ivoronline.springboot_db_query_native_named_repository.repositories;

import com.ivoronline.springboot_db_query_native_named_repository.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  Object findByNameAgeIndexed(String name, Integer age);
  Object findByNameAgeNamed  (String name, Integer age);
}


