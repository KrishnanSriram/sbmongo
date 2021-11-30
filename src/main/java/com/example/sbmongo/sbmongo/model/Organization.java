package com.example.sbmongo.sbmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "organization")
public class Organization {
    @Id
    private String orgId;
    private String name;
    private Address address;
    private String website;
    private List<Employee> employees;
}
