package BaseJava.Lesson6.Sandbox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
                int i = iterator.next();
                if (i==1) {
                    iterator.remove();
            }
            System.out.println(list.toString());

        }
    }
}
