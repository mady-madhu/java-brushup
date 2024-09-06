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
        System.out.println("");
        InterfaceA.super.m();
    }


}
