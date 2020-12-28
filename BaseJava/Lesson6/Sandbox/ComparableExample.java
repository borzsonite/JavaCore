package BaseJava.Lesson6.Sandbox;

// В отличае от Comparator который создает класс сравнивающий два объекта, Comparable реализуется классом который необходимо сделать сравнимваемым, и далее в этом классе реализуется метод .compareTo() в котором задается логика сравнения обеъкта

//

import java.util.*;

public class ComparableExample {
    public static void main(String[] args) {
        Set<Person> peopleSet = new TreeSet<>();
        List<Person> peopleList = new ArrayList<>();

        addElement(peopleList);
        addElement(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);


    }

    private static void addElement(Collection<Person> collection) {
        collection.add(new Person(1, "Bob"));
        collection.add(new Person(2, "Mary"));
        collection.add(new Person(3, "Jhon"));
        collection.add(new Person(4, "Georgy"));
    }

}

class Person implements Comparable<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if(this.getName().length() > o.getName().length()) {
            return -1;
        } else if (this.getName().length()< o.getName().length()) {
            return  1;
        } else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

