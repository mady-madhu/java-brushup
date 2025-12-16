package org.example.thread;

public class MultiThreadExample {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Available cores: " + coreCount);

        for (int i = 0; i < coreCount; i++) {
            new Thread(() -> {
                System.out.println("Thread " + Thread.currentThread().getName() + " running on core");
                // Simulate work
                for (int j = 0; j < 1000000; j++) Math.random();
            }).start();
        }
    }
}
