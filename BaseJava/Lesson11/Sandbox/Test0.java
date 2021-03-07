package BaseJava.Lesson11.Sandbox;

public class Test0 {
    public static void main(String[] args) throws InterruptedException {
        myThread myThread = new myThread();
        myThread myThread1 = new myThread();
        Thread.sleep(1000);
        myThread.start();
        myThread1.start();
        System.out.println("Hello from main thread");
    }
}

class myThread extends Thread {
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from my thread " + i);
        }

    }
}
