package org.example.inheritance;

public class Child extends Parent{
    void show(String s) { System.out.println("Child"); }

    public static void main(String[] args) {
        Parent p = new Child();
        p.show("Hello");
    }
}
