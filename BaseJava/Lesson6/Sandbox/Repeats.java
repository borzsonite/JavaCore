package BaseJava.Lesson6.Sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Повторение использованния класса Comparator
public class Repeats {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("aafa");
        stringList.add("cffc");
        stringList.add("fdab");
        stringList.add("daa");
        stringList.add("aff");

        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);

        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(0) > o2.charAt(0)) {
                    return -1;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        Collections.sort(stringList, (o1, o2) -> {
            if(o1.charAt(0) > o2.charAt(0)) {
                return -1;
            } else if (o1.charAt(0) < o2.charAt(0)) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(stringList);
    }
}
