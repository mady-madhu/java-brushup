package org.example.thread;

import org.example.Employee;

public class MyThread implements Runnable {

    @Override
    public void run() {
        Thread.yield();
        for(int i=0;i<10;i++){
            System.out.println("Child "+i);
        }
    }
}
