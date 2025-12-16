package org.example.record;

public record Person(String name, int age) {
    // Optional: Compact constructor for validation
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // Optional: Custom method
    public String greet() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}