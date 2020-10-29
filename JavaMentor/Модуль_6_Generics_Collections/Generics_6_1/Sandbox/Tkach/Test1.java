package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Tkach;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();
        rawList = list;
        rawList.add(8);
        list.add("6");
        System.out.println(rawList.equals(list));
        String s = list.get(0);

    }
}
