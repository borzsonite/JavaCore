package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_7_2_12_var {

        public static void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            in.lines()
                    .map(line -> line.toLowerCase().replaceAll("\\p{Punct}"," ").split("\\s+"))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(10)
                    .map(entry->entry.getKey())
                    .forEach(System.out::println);

            in.close();
        }
    }

