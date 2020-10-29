package JavaMentor.Модуль_6_Generics_Collections.Collections_6_2.Sandbox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alpha on 05.10.2020.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            list.add(i);
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if(it.next() == 5) it.remove();
        }
        for (Integer elem: list) {
            System.out.println(elem);
        }
    }
}
