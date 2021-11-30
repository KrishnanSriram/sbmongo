package com.example.sbmongo.sbmongo.service;

import com.example.sbmongo.sbmongo.model.Employee;
import com.example.sbmongo.sbmongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> findEmployee(String employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    public List<Employee> listAllEmployees() {
        return employeeRepository.findAll();
    }
}
