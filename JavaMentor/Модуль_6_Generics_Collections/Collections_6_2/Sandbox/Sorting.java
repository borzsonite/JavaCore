package JavaMentor.Модуль_6_Generics_Collections.Collections_6_2.Sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {


    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Tom", 20));
        persons.add(new Person("Boby", 24));
        persons.add(new Person("Tomson", 21));
        persons.add(new Person("Christopher", 20));
        persons.add(new Person("Anna", 10));
        persons.add(new Person("Maya", 6));

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Collections.sort(persons, comparator);
        System.out.print(persons);
    }

    class MyComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return 1;
        }
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
