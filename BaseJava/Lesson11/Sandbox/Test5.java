package BaseJava.Lesson11.Sandbox;
// Паттерн producer-consumer, part 1

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test5 {
    private static BlockingQueue blockingQueue = new ArrayBlockingQueue(10);
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Test5.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Test5.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join(); // эти строки необходимиы, чтоб программа не закончилась раньше чем выполнятся поткои thread1, thread2. Конец программы завершение потока метода main()

    }

    public static void produce() throws InterruptedException {
        while(true) {
            Random random = new Random();
            blockingQueue.put(random.nextInt(100));
        }
    }

    public static void consume() throws InterruptedException {
        while(true) {
            Thread.sleep(1000);
            System.out.println(blockingQueue.take());
            System.out.println("Size is " +blockingQueue.size());
        }
    }
}
