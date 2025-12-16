package org.example.single;

public class Employee {

    private Employee(){}

    private static Employee emp=null;

    public Employee getSingleEmployee(){

        if(emp ==null){
            return new Employee();
        }
        return emp;
    }

}
