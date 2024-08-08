package org.example;


import java.time.Duration;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LowLatencyQueueExample {
    private final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

    public void addToQueue(String item) {
        queue.offer(item);  // Non-blocking, lock-free addition to the queue
    }

    public String pollFromQueue() {
        return queue.poll();  // Non-blocking, lock-free retrieval from the queue
    }

    public static void main(String[] args) throws InterruptedException {
        LowLatencyQueueExample example = new LowLatencyQueueExample();

        // Simulate adding items to the queue in one thread
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                example.addToQueue("Item " + i);
            }
        }).start();

        Thread.sleep(20);
        // Simulate polling items from the queue in another thread
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                String item = example.pollFromQueue();
                if (item != null) {
                    System.out.println("Polled: " + item);
                }
            }
        }).start();

    }
}
