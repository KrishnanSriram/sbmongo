package com.example.sbmongo.sbmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "employees")
public class Employee {
    @Id
    private String employeeId;
    private String firstName;
    private String lastName;
    private String dob;
    private Address homeAddress;
}
