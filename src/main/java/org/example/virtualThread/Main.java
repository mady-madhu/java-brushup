package org.example.virtualThread;

public class Main {

    static {
        System.out.println("hello world");
    }

    public static void main(String[] args) throws InterruptedException {
        Emp e = new Emp();
        Thread.Builder ofVirtual = Thread.ofVirtual().name("name",0);
        Thread virtualThread = ofVirtual.start(() -> {
            System.out.println("Virtual Thread");
        });
        System.out.println(virtualThread);
        virtualThread.join();

        var s = "";
    }
}
