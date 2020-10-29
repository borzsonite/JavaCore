package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox.StreamsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        //.distict - оставляет в стриме только уникальные элементы
        List<Integer> list1 = Arrays.asList(1,2,3,4,2,3,5,6,7,1);
        System.out.println(list1.stream().distinct().collect(Collectors.toList()));

        List<String> list2 = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "for", "GeeksforGeeks");
        list2.stream().distinct().forEach(System.out::println); // вывести уникальные элементы листа
        list2.stream().distinct().forEach(s -> System.out.println(s.length())); // взять уникалььные элементы и вывести их длину
        long count = list2.stream().distinct().count(); // количество уникальных элементов
        System.out.println(count);

        //.sorted()
        List<Integer> list3 = Arrays.asList(-9, -18, 0, 25, 4);
        System.out.println("==========.sorted()=============");
        list3.stream().sorted().forEach(System.out::println);
        list2.stream().distinct().sorted().forEach(System.out::println);
        list2.stream().distinct().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);

        //.skip() пропустить несколько элемнетов стрима
        System.out.println("==========.skip()=============");
        System.out.println(list1.stream().skip(3).collect(Collectors.toList()));
        list1.stream().skip(3).forEach(System.out::println);

    }
}
