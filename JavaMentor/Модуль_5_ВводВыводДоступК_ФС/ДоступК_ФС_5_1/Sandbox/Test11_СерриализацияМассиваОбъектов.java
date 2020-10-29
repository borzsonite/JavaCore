package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.*;
import java.util.Arrays;

public class Test11_СерриализацияМассиваОбъектов {

    public static void main(String[] args) {
        Persona[] people = {new Persona(1,"Bob"), new Persona(2, "Mike"), new Persona(3, "Jhon")};
        // 1. Создали массив (объект)
        // 2. Записываем объект в файл

        writeObject(people); // запись массива объектов в файл

        try {
            readObject(new FileInputStream("persons.bin")); //чтение массива объектов из файла
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    static void writeObject(Object obj) {
        try {
            FileOutputStream fos = new FileOutputStream("persons.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readObject(FileInputStream fis) {
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            Persona[] people = (Persona[]) ois.readObject();
            System.out.println(Arrays.toString(people));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}

class Persona implements Serializable {
    String name;
    int id;

    Persona(int id, String name) {
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