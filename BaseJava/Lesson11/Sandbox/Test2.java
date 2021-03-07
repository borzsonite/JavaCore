package BaseJava.Lesson11.Sandbox;
//Ключевое слово synchronized. Часть 1.

import BaseJava.Lesson2.Sandbox.Test;

public class Test2 {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test2 test2 = new Test2();
        test2.doWork();
    }

    public synchronized void increment() {
        counter++;
    }

    public void increment2() {
        synchronized (this) {
            counter++;
        }
    }

    public void doWork() throws InterruptedException {
        Thread myThread1 = new Thread(() -> {
            for(int i=0; i<10000; i++) {
                 //counter++;
                increment();
            }
        });

        Thread myThread2 = new Thread(() -> {
            for(int i=0; i<10000; i++) {
               // counter++;
                increment();
            }
        });

        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();

        System.out.println(counter);

    }
}
