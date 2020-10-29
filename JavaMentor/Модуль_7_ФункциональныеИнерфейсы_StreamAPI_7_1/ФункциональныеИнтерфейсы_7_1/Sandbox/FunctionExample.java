package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

import java.util.function.Function;

public class FunctionExample {
    static Function<String, Integer> conventer = new Function<String, Integer>() { // с помощью анонимного класса имплементящего ФИ
        @Override
        public Integer apply(String s) {
            return Integer.parseInt(s) + 10;
        }
    };

    static Function<String, Integer> converter1 = s -> Integer.parseInt(s)+10; // с помощью лямбды

    public static void main(String[] args) {
        System.out.println(conventer.apply("3"));
        System.out.println(converter1.apply("10"));

    }
}
