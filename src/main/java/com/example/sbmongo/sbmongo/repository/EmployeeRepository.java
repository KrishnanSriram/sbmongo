package com.example.sbmongo.sbmongo.repository;

import com.example.sbmongo.sbmongo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
    @Query("{employeeId: '?0'}")
    public Optional<Employee> findByEmployeeId(String employeeId);
}
