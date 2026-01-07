package org.example.record;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        System.out.println(person1); // Uses generated toString()
        System.out.println(person1.name()); // Accessor method
        System.out.println(person2.age()); // Accessor method
        System.out.println(person1.greet()); // Custom method

        // Equality check using generated equals()
        Person person3 = new Person("Alice", 30);
        System.out.println("Are person1 and person3 equal? " + person1.equals(person3));





    }
}
