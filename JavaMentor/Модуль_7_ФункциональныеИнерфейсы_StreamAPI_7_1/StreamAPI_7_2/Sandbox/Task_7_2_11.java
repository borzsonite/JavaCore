package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
 * <p>
 * Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:
 * minMaxConsumer.accept(min, max);
 * <p>
 * Если стрим не содержит элементов, то вызовите:
 * minMaxConsumer.accept(null, null);
 * <p>
 * 2. Метод должен находить минимум и максимум в потоке, с помощью order.
 * 3. Полученные данные должны быть записаны minMaxConsumer, согласно условию
 */
public class Task_7_2_11 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(5);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                } else return 0;
            }
        };


        BiConsumer<Integer, Integer> biConsumer = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                System.out.println("Min:" + integer + " Max:" + integer2);
            }
        };

        findMinMax(list.stream(), comparator, biConsumer);
    }

    public static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<? super T> list = stream.sorted(order).collect(Collectors.toList());
        if(list.size() == 0) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept((T)list.get(0), (T) list.get(list.size()-1));
        }

    }
}
