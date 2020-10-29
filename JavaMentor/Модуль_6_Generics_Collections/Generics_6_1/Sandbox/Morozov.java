package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Morozov {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Gen<?> gen = new Gen<>();
        gen.m(integerList);
    }

    static class Gen<T> {

        <T> void m(Collection<T> collection) {
            for (T s : collection) {
                System.out.println(s);
            }
        }

        <T> void m(List<String> list) {
            for (String s : list
            ) {
                System.out.println(s);
            }
        }
    }
}


