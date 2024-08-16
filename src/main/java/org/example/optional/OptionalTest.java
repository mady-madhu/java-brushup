package org.example.optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<Void> emp = Optional.empty();
        System.out.println(emp);


        Optional<String> hello = Optional.of("hello");
        System.out.println(hello);




        Optional<String> helloNullable = Optional.ofNullable(null);
        System.out.println(helloNullable);


        Optional<String> helloNull = Optional.of(null);
        System.out.println(hello);



    }
}
