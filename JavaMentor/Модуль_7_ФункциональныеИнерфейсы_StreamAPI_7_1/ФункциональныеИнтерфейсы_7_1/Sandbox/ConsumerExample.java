package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

/**
 https://www.youtube.com/watch?v=5uJ8jSf-c9g
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static class ConsumerEx implements Consumer<Integer> { // создаем класс Consumer
        @Override
        public void accept(Integer integer) { // в котором переопределяем метод accept
            System.out.println(integer); // прописываем логику
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // далее 3 варинта использоваия Consumer'a
        System.out.println("=====================var 1==================");
        ConsumerEx ex = new ConsumerEx(); // 1. Создать экземпляр класса
        list.forEach(ex); // и передать его в качестве парметра в метод

        System.out.println("=====================var 2==================");
        list.forEach(new Consumer<Integer>() { // 2. В методе прописать анонимный класс реализующий Consumer'a
            @Override
            public void accept(Integer integer) {
                System.out.println(integer); // в котором переопеделить метод accept
            }
        });

        System.out.println("=====================var 3==================");
        list.forEach(integer -> System.out.println(integer)); // 3. заменить анонимный класс реализующиий ФИ на лямбду.
    }
}





