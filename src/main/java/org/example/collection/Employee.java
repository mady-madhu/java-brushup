package org.example.collection;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.model.Address;

@AllArgsConstructor(staticName = "of")
@Data
public class Employee {

    private int id;
    private String name;
    private int age;
    private int salary;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
