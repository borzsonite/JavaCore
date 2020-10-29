package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Alpha on 06.10.2020.
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa1", "cc2", "cc1", "aa2", "bb1");
        list.stream() // создаем поток у коллекции
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

            }


}

class Person{

}
