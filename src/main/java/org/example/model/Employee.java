package org.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor(staticName = "of")
@Data
public class Employee {

    private int id;
    private String name;
    private int age;
    private int salary;

}
