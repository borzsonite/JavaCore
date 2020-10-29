package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.АбстрактныеКлассы_и_Интерфейсы_3_5.Sandbox;

public class Test2 extends Test1 {
    @Override
    public void sayHello() {
        System.out.println("Privet");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test2();
        Test2 t2 = new Test2();
        t2.print();
        t2.sayHello();

        t1.print();
        t1.sayHello();
    }
}
