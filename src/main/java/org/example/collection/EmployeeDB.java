package org.example.collection;

import java.util.List;

public class EmployeeDB {

    public static List<Employee> getEmployees() {

        return List.of(Employee.of(109, "d", 9, 5000),
                Employee.of(99, "b", 11, 6000),
                Employee.of(89, "c", 11, 3000),
                Employee.of(69, "a", 13, 3000));
    }
}
