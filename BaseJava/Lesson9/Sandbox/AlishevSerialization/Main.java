package BaseJava.Lesson9.Sandbox.AlishevSerialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1, "Bob");
        writeObject(person);
        System.out.println(readPerson());

    }

    private static void writeObject(Person person) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(".\\BaseJava\\Lesson9\\Sandbox\\AlishevSerialization\\test.bin"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Person readPerson() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(".\\BaseJava\\Lesson9\\Sandbox\\AlishevSerialization\\test.bin"))) {
            Person person = (Person) ois.readObject();
            return person;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}



class Person implements Serializable {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}