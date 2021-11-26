package com.example.sbmongo.sbmongo.repository;

import com.example.sbmongo.sbmongo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PersonRepository extends MongoRepository<Person, Integer> {
  @Query("{lastName: '?0'}")
  Person findPersonByLastName(String name);
  @Query("{firstName: '?0'}")
  Person findPersonByFirstName(String name);

  public long count();
}
