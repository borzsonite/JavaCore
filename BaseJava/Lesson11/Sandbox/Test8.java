package BaseJava.Lesson11.Sandbox;
//25. Класс CountDownLatch
// В конструктор CountDownLatch передается число - сколько раз должен выполнится метод CountDownLatch.countDown();


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=0; i<3; i++) {
            executorService.submit(new Processor1(i, countDownLatch));
        }
        executorService.shutdown();

        countDownLatch.await();
        System.out.println("Main thread has been proceeded");
    }
}

class Processor implements Runnable{
    private CountDownLatch countDownLatch;
    private int id;

    public Processor(int id, CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + id + " counting...");
        countDownLatch.countDown();
    }
}
