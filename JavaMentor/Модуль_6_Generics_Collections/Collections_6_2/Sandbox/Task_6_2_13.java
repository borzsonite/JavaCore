package JavaMentor.Модуль_6_Generics_Collections.Collections_6_2.Sandbox;

import java.util.*;

/*
Реализуйте метод symmetricDifference, вычисляющий симметрическую разность двух множеств. Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

Пример ввода: [1, 2, 3} и {0, 1, 2]
Пример вывода: [0, 3]
**/

public class Task_6_2_13 {
    public static void main(String[] args) {
        Set s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        HashSet s2 = new HashSet<>();
        s2.add(0);
        s2.add(1);
        s2.add(2);

        Set result = symmetricDifference(s1, s2);
        System.out.println(result);
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> jointSet = new HashSet<>();

        for(T elem: set2) {
            System.out.println(elem);
        }

        for (T elem : set1) {
            if (!set2.contains(elem)) {
                jointSet.add(elem);
            }
        }
        for (T elem : set2) {
            if (!set1.contains(elem)) {
                jointSet.add(elem);
            }
        }
        return jointSet;
    }


}
