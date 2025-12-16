package org.example.collection;

import java.util.List;

public class EmployeeDB {

    public static List<Employee> getEmployees() {

        return List.of(Employee.of(109, "a", 12, 5000),
                Employee.of(99, "b", 13, 6000),
                Employee.of(89, "c", 9, 3000),
                Employee.of(69, "c", 9, 3000));
    }
}
