package org.example.thread;

public class Printer {
    //centralized signal for inter thread communication
    private volatile boolean isOdd;

    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();// Even thread will release the lock and wait for notification
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait(); // odd thread will release the lock and wait for notification
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }
}