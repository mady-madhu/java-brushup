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


    public static void main(String[] args) {
        B b = new B(10);
        b.m1();
        b.m2();

        A a = new B(20);
        a.m1();
        a.m3();

        A a1= new A(10);
        a1.m1();
    }
}
