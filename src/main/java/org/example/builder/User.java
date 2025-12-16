package org.example.builder;

public class User {

    private final String name;
    private final int age;
    private final int sal;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sal = builder.sal;
    }


    public static class UserBuilder{
        private final String name;
        private final int age;
        private final int sal;

        public UserBuilder(String name, int age, int sal) {
            this.name = name;
            this.age = age;
            this.sal = sal;
        }


        public static UserBuilder create(String name, int age,int sal) {
            return new UserBuilder(name, age,sal);
        }

        public User build() {
            return new User(this);  // Call private constructor
        }


    }




}
