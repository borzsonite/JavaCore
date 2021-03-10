package BaseJava.Lesson11.Sandbox;
//23. Методы wait(), notify();

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer wn = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
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

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            wait(); // 1. Освобождает монитор, 2.Ждет вызова метода notify()
            System.out.println("Producer thread resumed...");

        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Waiting for key press");
            scanner.nextLine();
            notify(); // 3. Пробуждает поток который вызвал метод wait()
            // 4. Метод заканчивает работу и возвращается на строку следующую за wait()
            // 5. При этом важно чтобы потоки синхранизировались на одном и том же объекте (мониторе)
        }

    }
}
