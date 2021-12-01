package com.ivoronline.springboot_db_query_native_named_repository.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@NamedNativeQuery(
  name        = "Person.selectPerson",
  query       = "SELECT * FROM Person WHERE name = ?1 AND age = ?2",
  resultClass = Person.class
)
@NamedNativeQuery(
  name        = "Person.insertPerson",
  query       = "INSERT INTO PERSON (name, age) VALUES (:name, :age)",
  resultClass = Person.class
)
@NamedNativeQuery(
  name        = "Person.updatePerson",
  query       = "UPDATE PERSON SET AGE = :newAge WHERE NAME = :name",
  resultClass = Person.class
)
@NamedNativeQuery(
  name        = "Person.deletePerson",
  query       = "DELETE FROM PERSON WHERE NAME = :name",
  resultClass = Person.class
)
@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

}
