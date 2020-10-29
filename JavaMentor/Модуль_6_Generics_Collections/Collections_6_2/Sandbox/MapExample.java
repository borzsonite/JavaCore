package JavaMentor.Модуль_6_Generics_Collections.Collections_6_2.Sandbox;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");

        System.out.println(map);
        System.out.println(map.get(1));
        for(Map.Entry<Integer, String> elem: map.entrySet()) {
            System.out.println(elem.getKey() + ":" + elem.getValue());
        }

    }
}
