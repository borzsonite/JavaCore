package BaseJava.Lesson11.Sandbox;
// 26. Класс ReentrantLock

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        Thread thread1 = new Thread(() -> task.thirstThread());
        Thread thread2 = new Thread(()-> task.secondThread());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCount();
    }
}

class Task {
    private int count;
    Lock lock = new ReentrantLock();

    public void increment() {
        for(int i=0; i<10000; i++) {
            count++;
        }
    }

    public void thirstThread() {
        lock.lock();
        increment();
       lock.unlock();
    }

    public void secondThread() {
        lock.lock();
        increment();
        lock.unlock();
    }

    public void showCount() {
        System.out.println(count);
    }
}