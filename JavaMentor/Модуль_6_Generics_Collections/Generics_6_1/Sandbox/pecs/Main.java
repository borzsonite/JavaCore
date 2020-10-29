package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.pecs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Alpha on 09.10.2020.
 */
public class Main {
    static class Animal {
        void feed() {
        }
    }

    static class Pet extends Animal {
        void call() {
            System.out.println("Hello from Pet");
        }

    }

    static class Kitty extends Pet {
        void mew() {
            System.out.println("mew");
        }

        void call() {
            System.out.println("Hello from Kitty");

        }

        static class Doge extends Pet {
            void bark() {
                System.out.println("bark");
            }
        }

        public static void main(String[] args) {

            Pet kitty1 = new Kitty();
            Pet kitty2 = new Kitty();
            Pet kitty3 = new Kitty();
            Pet kitty4 = new Kitty();


            //Теперь мы хотим скопировать из списка Питомцев в список Питомцев и позвать их.
            List<Pet> src = new ArrayList<>();
            List<Pet> dest = new ArrayList<>(src);
            Collections.addAll(src, kitty1, kitty2, kitty3, kitty4);

            Collections.copy(dest, src);
           // for (Pet p : dest) p.call();

            //Пока все ок. А что если бы в src были явно Котики (унаследованные от Питомцев)?
            List<Kitty> src1 = new ArrayList<>();
            List<Pet> dest1 = new ArrayList<Pet>(src1);

            Collections.copy(dest1, src1);
            for (Pet p : dest1) p.call();

        }
    }
}

// Если Есть родитель Pet и наследник Cat, то если сослать экземпляр Сat на родителя: Pet cat = new Cat(); то cat будут доступны только методы родителя - Pet. При этом в случае если в потомках переопределить методы родителя, то будут вызываться методы потомка (полиморфизм).
// В случае Cat cat = new Cat() доступны все методы как родителя, так и потомка.


