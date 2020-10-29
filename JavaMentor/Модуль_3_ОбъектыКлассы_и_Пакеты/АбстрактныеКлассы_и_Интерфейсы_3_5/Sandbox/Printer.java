package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.АбстрактныеКлассы_и_Интерфейсы_3_5.Sandbox;

/**
 * Created by Alpha on 16.09.2020.
 */
public abstract class Printer implements Printable {
    public abstract void print();

    static  void run() {
        System.out.println("I'm running..");
    }
}

 class Test extends Printer {

     @Override
     public void print() {
     }

     @Override
     public void sayHello() {
     }
 }

 class Main {
     public static void main(String[] args) {
         Test test = new Test();
         test.run();
         Test.run();

     }
 }
