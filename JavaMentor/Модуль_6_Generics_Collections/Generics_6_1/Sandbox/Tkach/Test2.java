package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Tkach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test2 {

   static void print(Collection<String> collection) {
        for (String elem: collection) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        print(strings);
       //  print(objects); так нельзя потому что .print() в параметрах может принять только коллекцию String. ie. print(Collection<String> collection)
    }


}
