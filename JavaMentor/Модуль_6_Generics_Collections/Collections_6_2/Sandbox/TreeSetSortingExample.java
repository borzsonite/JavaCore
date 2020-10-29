package JavaMentor.Модуль_6_Generics_Collections.Collections_6_2.Sandbox;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortingExample {

    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();

        integers.add(3);
        integers.add(2);
        integers.add(10);
        integers.add(1);
        integers.add(0);
        integers.add(7);

        Comparator<Integer> comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer)o1>(Integer)o2?1:-1;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
    }


}
