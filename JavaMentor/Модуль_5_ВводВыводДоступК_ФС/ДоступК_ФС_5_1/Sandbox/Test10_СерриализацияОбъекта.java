package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Test10_СерриализацияОбъекта {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Bob");
        Person p2 = new Person(2, "Jhon");
        System.out.println("");

        writeObject(p1);

        try {
            readObject(new FileInputStream("person.bin"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    static void writeObject(Object obj) {
        try {
            FileOutputStream fos = new FileOutputStream("person.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            System.out.println("Запись ок...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readObject(FileInputStream fis) { // принимаем стрим из файла
        System.out.println("Try to read...");
        try {
            ObjectInputStream ois = new ObjectInputStream(fis); // создаем новый стрим для чтения объекта, в конструктор которого передаем стрим из файла
            Person p1 = (Person) ois.readObject(); //Записываем в переменную р1, то что было прочитано из стрима объекта
            System.out.println(p1.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}


class Person implements Serializable {
    private static final long serialVersionUID = 12345L;
    String name;
    int id;
    int age;

    Person(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name=" + name +
                ", id=" + id;
    }
}
