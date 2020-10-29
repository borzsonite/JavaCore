package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Alishev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Test3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbuy");
        list.add("aa");
        list.add("abbb");
        list.add("cc");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length()>o2.length()) {
//                    return 1;
//                } else if(o1.length()<o2.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        Comparator<String> comparator = (o1, o2) -> o1.length()>o2.length()?1:-1; //  вар. 1. можно записать лямбду в переменную,  которую затем передать в метод sort
       // list.sort((o1, o2) -> o1.length()>o2.length()?1:-1); // вар. 2. можно в параметрах метода записать лябмду

        list.sort(comparator);
        System.out.println(list);

    }
}
