package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;
import java.util.*;
import java.util.function.Function;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number));
        numbers.forEach(System.out::println);


        Function<String, Integer> toInteger = string -> parse(string);
        Integer integer = toInteger.apply("777");
        System.out.println(integer);
    }

    private static Integer parse(String s) {
        return Integer.parseInt(s);
    }
}
