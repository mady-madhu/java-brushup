package org.example.optional;


import java.util.Optional;

/**
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Employee e = null;
        //e.setName(null);

        String s = Optional.ofNullable(e)
                .map(Employee::getName)
                .orElse("hel");

        System.out.println(s);
    }
}
