package org.example.inheritance;

public interface InterfaceA {

    void m1();
    default void m(){
        System.out.println("interface A");
    }
}
