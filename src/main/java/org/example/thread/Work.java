package org.example.thread;

public class Work implements Runnable{
    private volatile boolean running = true;

    @Override
    public void run() {
        while(running){
            System.out.println("worker running");
        }
        System.out.println("worker Stopped");
    }

    public void stopRunning(){
        running = false;
    }
}
