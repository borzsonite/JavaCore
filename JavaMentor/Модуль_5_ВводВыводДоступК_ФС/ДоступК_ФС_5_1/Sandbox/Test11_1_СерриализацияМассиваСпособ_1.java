package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.awt.*;
import java.io.*;
import java.util.Arrays;

/**
 * Created by Alpha on 22.09.2020.
 */
public class Test11_1_СерриализацияМассиваСпособ_1 {

    public static void main(String[] args) {
        Animal[] animals = {
                new Animal(1, "Cat"),
                new Animal(2, "Dog")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animals.bin"))) {
            oos.writeInt(animals.length); // записываем в

            for (Animal animal : animals) {
                oos.writeObject(animal);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readObject(new FileInputStream("animals.bin"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    static void readObject(FileInputStream fis) {
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            int animalsCount = ois.readInt();
            Animal[] animals = new Animal[animalsCount];
            for (int i = 0; i < animalsCount; i++) {
                try {
                    animals[i] = (Animal) ois.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            for(Animal animal: animals) {
                System.out.println(animal);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class Animal implements Serializable {
    int id;
    String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal:" + "id:" + id + " name: " + name;
    }
}
