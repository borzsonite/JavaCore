package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.video1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static class Generics2 { // можно не параметризовывать класс, а параметризовать метод copy

        <T> void copy(List<? extends T> src, List<? super T> dest) {
         //   src.get(1);
         //   dest.add(new Generics01());
            dest.addAll(src);
        }

        public static void main(String[] args) {
            Generics2 g = new Generics2(); // создаем объект чтобы применить метод
            List<Integer> src = new ArrayList<>(); // создаем источник который extends Generics01 i.e List<? extends Generics01>, вместо ? можно подставить F т.к. он extends Generics01
            src.add(1);
            src.add(1);
            src.add(1);

            List<Object> dist = new ArrayList<>(); // dist ссылается на List<? super Generics01) ie на Generics01
            g.copy(src, dist);
            System.out.println(src.size());
        }
    }

   static class Generics01 {

    }

    static class F extends Generics01 {

    }
}
