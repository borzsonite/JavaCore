package BaseJava.Lesson11.Sandbox;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        myThread1 myThread1 = new myThread1();
        myThread1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread1.stopRunning();

    }
}

class myThread1 extends Thread {
    private volatile boolean  running = true;

    @Override
    public void run() {
        while(running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected void stopRunning() {
        this.running = false;
    }

}
