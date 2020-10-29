package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Task_7_1_8;

import java.util.function.Supplier;

public class SupplierExample {
    static Supplier<String> hello = ()-> "Hello word"; // Вариант 1 - через лямбду

    static Supplier<String> getHello = new Supplier<String>() { // Вариант 2 через анонимный класс
        @Override
        public String get() {
            return "Say Hello!";
        }
    };

    public static void main(String[] args) {
        System.out.println(hello.get());
        System.out.println(getHello.get());
    }
}
