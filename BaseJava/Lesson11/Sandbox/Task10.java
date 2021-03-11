package BaseJava.Lesson11.Sandbox;
//27. Семафор (Semaphore)

import java.util.concurrent.*;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        Connection connection = Connection.getConnection();
        for(int i=0; i<200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

// Singleton
class Connection {
   private static Connection connection = new Connection();
   private int connectionsCount;
   private final Semaphore semaphore = new Semaphore(10);

    private Connection() {

    }

    public static Connection getConnection () {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        doWork();
        semaphore.release();
    }

    public void doWork() {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            connectionsCount--;
        }
    }
}
