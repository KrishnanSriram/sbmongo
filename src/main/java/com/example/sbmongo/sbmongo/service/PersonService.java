package com.example.sbmongo.sbmongo.service;

import java.util.List;
import java.util.Optional;

import com.example.sbmongo.sbmongo.model.Person;
import com.example.sbmongo.sbmongo.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
  @Autowired
  private PersonRepository personRepository;

  public Person savePerson(Person person) {
    return personRepository.save(person);
  }

  public Optional<Person> findPerson(int personId) {
    return personRepository.findById(personId);
  }

  public List<Person> listAllPeople() {
    return personRepository.findAll();
  }
}
