package BaseJava.Lesson11.Sandbox;

import java.util.LinkedList;
import java.util.Queue;

// 24. Паттерн producer - consumer (II часть)
public class Test7 {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}

class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    final Object lock = new Object();
    public void produce() throws InterruptedException {
        int count = 0;
        while(true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();
                }
                queue.offer(count++);
            }
        }
    }

    public void consume() throws InterruptedException {
                while(true) {
                    synchronized (lock) {
                        while(queue.size()==0) {
                            lock.wait();
                        }
                       int value = queue.poll();
                        System.out.println(value);
                        System.out.println("queue size is " + queue.size());
                        lock.notify();
                    }
                    Thread.sleep(1000);
                }

    }
}
