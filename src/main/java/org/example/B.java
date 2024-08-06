package org.example;

public class B extends A {

    B(int i){

    }

    @Override
    public void m1() {
        System.out.println("overridden m1");
    }

    public void m2(){
        System.out.println("m2 child");
    }
}
