package org.example;

import org.example.InterfaceA;
import org.example.InterfaceB;

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
