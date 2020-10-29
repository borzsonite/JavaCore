package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Alishev;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalsList = new ArrayList<>();
        Animal a1 = new Animal(1);
        Animal a2 = new Animal(2);
        animalsList.add(a1);
        animalsList.add(a2);


        List<Dog> dogsList = new ArrayList<>();
        Dog d1 = new Dog(3);
        Dog d2 = new Dog(4);
        dogsList.add(d1);
        dogsList.add(d2);

        test(animalsList);
        test((dogsList));
    }

    public static void test (List<? extends Animal> list) {
        for(Animal elem: list) {
            elem.sayHello();
        }
    }
}
