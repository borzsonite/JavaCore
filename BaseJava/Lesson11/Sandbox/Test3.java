package BaseJava.Lesson11.Sandbox;
//Ключевое слово synchronized. Часть 2.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.main();
    }
}

class Worker {
    long startTime;
    long runningTime;
    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    Object lock1 = new Object();
    Object lock2 = new Object();

    protected void addList1() {
        synchronized (lock1) {
            list1.add(random.nextInt(100));
        }
    }

    protected void addList2() {
        synchronized (lock2) {
            list2.add(random.nextInt(100));
        }

    }

    protected void work() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            Thread.sleep(1);
            addList1();
            addList2();
        }
    }

    public void main() throws InterruptedException {
        startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            try {
                work();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                work();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        runningTime = System.currentTimeMillis() - startTime;
        System.out.println(list1.size());
        System.out.println(list2.size());
        System.out.println(runningTime);
    }
}
