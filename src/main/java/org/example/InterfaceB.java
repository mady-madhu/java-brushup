package org.example;

public interface InterfaceB {
    void m1();
    default void m(){
        System.out.println("interface B");
    }
}
