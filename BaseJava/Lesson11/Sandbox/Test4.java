package BaseJava.Lesson11.Sandbox;
//21. Пул потоков

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // Создаем пул из двух потоков

//        for(int i=0; i<5; i++) {
//            executorService.submit(new Work(i)); // передаем в пул потоков 5 заданий
//        }

        // или
        executorService.submit(new Work(0)); // передаем в пул потоков 1-e задание
        executorService.submit(new Work(1)); // передаем в пул потоков 2-e задание
        executorService.submit(new Work(2)); // передаем в пул потоков 3-e задание
        executorService.submit(new Work(3)); // передаем в пул потоков 4-e задание
        executorService.submit(new Work(4)); // передаем в пул потоков 5-e задание
        executorService.submit(new Work(5)); // передаем в пул потоков 6-e задание


        executorService.shutdown(); // прекращаем прием заданий и начинаем выполнение полученных
        System.out.println("All tasks submitted");

        executorService.awaitTermination(1, TimeUnit.DAYS); // устанавливает период в течении которого будут ожидаться выполнение потокоми задач. Выполнение основного потока остановится на этой строке и продолжится по истечени указананного периода

    }
}

class Work implements Runnable {
    private int id;
    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work id " + id + " completed");
    }
}
