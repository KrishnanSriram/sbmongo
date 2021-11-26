package com.example.sbmongo.sbmongo.repository;

import com.example.sbmongo.sbmongo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
}
