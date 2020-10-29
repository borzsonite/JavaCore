package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Alishev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Алишев 2й урок про лямдбы. Использоварие методов из функционального программирования reduсe, sort, forEach etc... применительно к коллекциям
 */
public class Test4 {
    //1. Создать массив и лист, создать два метода для их заполения.
    public static void main(String[] args) {
        int[] array = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArray(array);
        fillList(list);


        //1. Метод .map()  выполняет какие то действия над элементами множества (массив, коллекция). Модифицирует элементы стрима!
        array = Arrays.stream(array).map(s -> s * 2).toArray(); // преобразуем массив в стрим; применяем к нему .map(); переводим стрим обратно в массив; перезаписываем переменную array =
        list = list.stream().map(s -> s * 2).collect(Collectors.toList());

        //2. Метод .filter() фильтрует элементы множества по условию в ЛВ. Модифицирует коллекцию!
        array = Arrays.stream(array).filter(s -> s % 2 == 0).toArray();
        list = list.stream().filter(s -> s > 10).collect(Collectors.toList());

        //3. Метод forEach() просто обходит множество, не модифицирую еuj.
        Arrays.stream(array).forEach(s -> System.out.print(s));
        list.stream().forEach(System.out::print);

        //4. Метод .reduce() преобразует множество в одино значение, например, находит сумму элементов массива.
        int sumArray = Arrays.stream(array).reduce((acc, b) -> acc + b).getAsInt();
        int sumList = list.stream().reduce((acc, b) -> acc + b).get();

        // вызов методов по цепочке
        int listReduce = list.stream().filter(s -> s%2==0).map(s->s+1).reduce((acc, b)-> acc +b).get(); // отсортировываем только четные элементы, затем прибавляем к каждому единицу, затем складываем дргуг с дргом

        System.out.println(Arrays.toString(array));
        System.out.println(list);
        System.out.println(sumArray);
        System.out.println(sumList);
        System.out.println(listReduce);
    }

    static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    static void fillList(List list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }


}
