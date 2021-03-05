package BaseJava.Lesson11_2.Sandbox;

public class Test1 {
    public static void main(String[] args) {
        myThread1 myThread1 = new myThread1();
        myThread1.start();
    }
}

class myThread1 extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
