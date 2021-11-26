package com.example.sbmongo.sbmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString()
@Data
@Document(collection = "People")
public class Person {
  @Id
  private String personId;
  private String firstName;
  private String lastName;
  private String email;
  private String mobile;
}
