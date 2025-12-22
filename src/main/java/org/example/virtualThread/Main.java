package org.example.virtualThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread.Builder ofVirtual = Thread.ofVirtual();
        Thread virtualThread = ofVirtual.start(() -> {
            System.out.println("Virtual Thread");
        });
        virtualThread.join();
    }
}
