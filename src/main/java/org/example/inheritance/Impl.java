package org.example.inheritance;

import org.example.inheritance.InterfaceA;
import org.example.inheritance.InterfaceB;

public class Impl implements InterfaceA, InterfaceB {
    @Override
    public void m1() {
           m();
    }

    @Override
    public void m() {
        InterfaceA.super.m();
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }

}
