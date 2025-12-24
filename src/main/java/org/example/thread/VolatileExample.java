package org.example.thread;

public class VolatileExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main is running");
        Work work = new Work();
        Thread worker = new Thread(work);
        worker.start();
        Thread.sleep(6000);
        work.stopRunning();
    }
}
