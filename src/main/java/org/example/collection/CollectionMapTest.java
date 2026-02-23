package org.example.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionMapTest {

    public static  void main(String[] args) {
        List<Employee> employees = EmployeeDB.getEmployees();
        Map<Integer, Employee> integerEmployeeMap = employees.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
        Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getId));
        System.out.println(integerEmployeeMap);
        System.out.println(collect);
    }


    public static void main1(String[] args) {
        List<Employee> employees = EmployeeDB.getEmployees();
        List<Employee> employeeStream = employees.stream().filter(e -> e.getAge() > 10)
                .sorted(Comparator.comparingInt(Employee::getAge).reversed()
                        .thenComparing(Employee::getName))
                .toList();
        System.out.println(employeeStream);


        List<Integer> collect = IntStream.range(0, 100).filter(n -> n % 2 == 0).boxed()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
