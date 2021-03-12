package BaseJava.Lesson11.Sandbox;

import java.util.concurrent.Semaphore;

public class PhilosophersQuiz {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Philosopher(semaphore, "Платон").start();
        new Philosopher(semaphore, "Аристотель").start();
        new Philosopher(semaphore, "Сократ").start();
        new Philosopher(semaphore, "Пифагор").start();
        new Philosopher(semaphore, "Демосфен").start();
    }
}

class Philosopher extends Thread {
    private String name;
    private boolean full;
    private Semaphore sem;

    public Philosopher(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {

        if(!full) {
            try {
                sem.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Философ " + name + " сел за стол");
            try {
                Thread.sleep(300);
                full = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Философ " + name + " поел");
            sem.release();
        }

    }




}
