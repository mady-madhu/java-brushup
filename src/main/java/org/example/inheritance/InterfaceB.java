package org.example.inheritance;

public interface InterfaceB {
    void m1();
    default void m(){
        System.out.println("interface B");
    }
}
