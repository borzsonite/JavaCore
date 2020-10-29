package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));
        List<String> vars = asList("Hello", "world");
        System.out.println(vars);

        List<String> petNames = new ArrayList<>();
        for (Human human : humans) {
            petNames.addAll(human.getPets());
        }

        System.out.println(petNames); // output [Buddy, Lucy, Frankie, Rosie, Simba, Tilly]
    }
}

class Human {
    private final String name;
    private final List<String> pets;

    Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public List<String> getPets() {
        return pets;
    }






    //constructors, getters
}


