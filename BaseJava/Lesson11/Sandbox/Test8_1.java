package BaseJava.Lesson11.Sandbox;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test8_1 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0; i<3; i++) {
            executorService.submit(new Processor1(i, countDownLatch));
        }
        executorService.shutdown();

        for(int i=0; i<3; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();
        }


    }
}

class Processor1 implements Runnable{
    private CountDownLatch countDownLatch;
    private int id;

    public Processor1(int id, CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.id = id;
    }

    @Override
    public void run() {

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + id + " proceeded...");
    }
}
