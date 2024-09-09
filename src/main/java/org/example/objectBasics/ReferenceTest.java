package org.example.objectBasics;


import org.example.model.Address;
import org.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ReferenceTest {

    public static void main(String[] args) {
        Employee employee = Employee.of(1, "aa", 27,1000, Address.of("SLC","UT","USA"));
        changeEmployeeValues(employee);
        System.out.println(employee);

        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        changeTheList(list);
        System.out.println(list);

        int val = 10;
        changeValue(val);
        System.out.println(val);

    }


    private static void changeTheList(List<Integer> list) {
        list = new ArrayList<>();
        list.add(5);
        list.add(6);

    }

    private static void changeValue(int val) {
        ++val;

    }

    private static void updateList(List<Integer> list) {
        list.add(3);
    }

    private static void changeEmployeeValues(Employee e) {
        e.setName("b");
    }


}
