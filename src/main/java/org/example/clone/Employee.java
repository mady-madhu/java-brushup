package org.example.clone;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor(staticName = "of")
public class Employee implements  Cloneable,Serializable {

    private int id;
    private String name;
    private int age;
    private int salary;

    private Address address;


    //it's a deep clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee clonedEmployee = (Employee) super.clone();
        clonedEmployee.address = (Address) address.clone(); //if you remove this statement it will be swallow cloning
        return clonedEmployee;
    }
}
