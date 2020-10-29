package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.ОсновыООП_3_1.Sandbox;
import JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.ОсновыООП_3_1.Sandbox.Test3;

public class Main {
    Main main = new Main();
    Main.Inner inner2 = new Inner();




    Inner inner = new Inner();

    public static void main(String[] args) {
        Test3 test3 = new Test3();
       // test3.id = 1;



    }

    private class Inner {
        void sayHello() {
            System.out.println("Hello");
        }
    }
}
