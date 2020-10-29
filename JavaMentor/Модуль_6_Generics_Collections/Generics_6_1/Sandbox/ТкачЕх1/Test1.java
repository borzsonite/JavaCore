package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.ТкачЕх1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();
        rawList = list;
        rawList.add(8);
        System.out.println(rawList.get(0));
       // String s = rawList.get(0);
    }
}
