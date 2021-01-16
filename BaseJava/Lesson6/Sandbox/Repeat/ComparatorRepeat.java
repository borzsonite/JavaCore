package BaseJava.Lesson6.Sandbox.Repeat;

// Создается экземпляр класса Компаратора, который передается в вторым параметров в метод sort()

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorRepeat {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("bbb");
        list.add("aaa");
        list.add("ccc");

        Collections.sort(list, new StingsComparator());

        list.sort(new StingsComparator()); // через передачу класса

        list.sort((o1, o2) -> Character.compare(o2.charAt(0), o1.charAt(0)));

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        System.out.println(list);

    }
}

class StingsComparator implements Comparator<String> { // это класс компаратора, который может быть заменен анонимным классом или лямбдой

    @Override
    public int compare(String o1, String o2) {
        if(o1.charAt(0)>o2.charAt(0)) {
            return -1;
        } else if(o1.charAt(0)<o2.charAt(0)) {
            return 1;
        } else return 0;
    }
}
