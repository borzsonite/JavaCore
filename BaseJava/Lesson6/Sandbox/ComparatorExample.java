package BaseJava.Lesson6.Sandbox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample  {



    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 20));
        students.add(new Student("Mike", 21));
        students.add(new Student("Ann", 16));
        students.add(new Student("Chelsy", 25));
        students.add(new Student("Ivan", 22));
        students.add(new Student("Ivan", 19));

        System.out.println(students);

        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));
        System.out.println(students);

    }
}

class Student {

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
