package BaseJava.Lesson12.Sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test0 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<10; i++) {
            list.add(random.nextInt(10));
        }
        list.forEach(System.out::println);
        System.out.println("-----------------------");
        list.stream().filter(s-> s<5).forEach(System.out::println);

        IntStream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x < 300)
                .map(x -> x + 11)
                .limit(3)
                .forEach(System.out::print);

        final List<Integer> ints = new ArrayList<>();
        IntStream.range(0, 10)

                .forEach(i -> {
                    ints.add(i);
                    System.out.println(i);
                });
        System.out.println(ints.size());

        IntStream.range(2, 9)
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);

        Stream.of("10", "11", "50")
                        .map(x -> Integer.parseInt(x, 16))
                        .forEach(System.out::println);

        Stream.of(120, 410, 85, 32, 314, 12)
                .limit(2)
                .limit(5)
                .forEach(System.out::println);

        int [] arr = {1, 2, 4,3, 5};
        int n = 0;
        for (int d : arr) {
            n = 10 * n + d;
        }
        System.out.println(n);

         Integer numbers = Arrays.asList(1, 2, 3, 4)
                 .stream()
                 .collect(Collectors.summingInt(((p) -> p % 2 == 1? p: 0)));
        System.out.println(numbers);


    }



}
