package org.example.thread;

public class ThreadDemo {

    public static void main(String[] args) {
        Runnable t = () -> {
            System.out.println("hello thread");
        };
        Thread th = new Thread(t);
        th.start();
    }
}
