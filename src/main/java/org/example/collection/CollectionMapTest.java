package org.example.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionMapTest {

    public void main1(String[] args) {
        List<Employee> employees = EmployeeDB.getEmployees();
        Map<Integer, Employee> integerEmployeeMap = employees.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
        System.out.println(integerEmployeeMap);
    }


    public static void main(String[] args) {
        List<Employee> employees = EmployeeDB.getEmployees();
        List<Employee> employeeStream = employees.stream().filter(e -> e.getSalary() > 10).sorted(Comparator.comparingInt(Employee::getSalary).thenComparing(Employee::getName)).toList();
        System.out.println(employeeStream);
    }
}
