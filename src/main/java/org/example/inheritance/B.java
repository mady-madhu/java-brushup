package org.example.inheritance;

import org.example.inheritance.A;

public class B extends A {


    public B(int i) {
        super(i);
    }

    @Override
    public void m1() {
        System.out.println("overridden m1");
    }

    public void m2(){
        System.out.println("m2 child");
    }
}
