package com.example.sbmongo.sbmongo.controller;

import java.util.List;
import java.util.Optional;

import com.example.sbmongo.sbmongo.model.Person;
import com.example.sbmongo.sbmongo.service.PersonService;

import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/people")
public class PersonController {

  @Autowired
  private PersonService personService;
  private Logger logger = LoggerFactory.getLogger(PersonController.class);

  @PostMapping()
  public ResponseEntity<Person> savePerson(@RequestBody Person person) {
    logger.debug("Invoked POST method");
    Person retPerson = personService.savePerson(person);
    return new ResponseEntity<>(retPerson, HttpStatus.CREATED);
  }

  @GetMapping("/{personId}")
  public ResponseEntity<Person> findPerson(@PathVariable("personId") int personId) {
    Optional<Person> person = personService.findPerson(personId);
    if(person.isPresent()) {
      return new ResponseEntity<>(person.get(), HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @GetMapping()
  public ResponseEntity<List<Person>> listAllPeople() {
    List<Person> people = personService.listAllPeople();
    return new ResponseEntity<>(people, HttpStatus.OK);
  }
  
  
}
