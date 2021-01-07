package BaseJava.Lesson8.Sandbox.RecurciveDirList;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String dir = "./"; // 1. Задаем в переменной имя директории
        File file = new File(dir); // 2. Создаем объект для хранения сущности пути
        if (!file.isDirectory()) { // 3. Проверяем, что данная сущеность действительно директория
            System.out.println("Is not a dir");
            return;
        }
        list(dir);
    }

    static void list(String dir) {
        File file = new File(dir);
        String[] dirsList = file.list(); // 4. Получаем в массив список директорий
        for (int i = 0; i < dirsList.length; i++) {
            File file1 = new File(dir + File.separator + dirsList[i]); // 5. если сущность в массиве
            if (file1.isFile()) { // является файлом
                System.out.println(dir + dirsList[i]); //6. вывести ее в консоль
            } else {
                list(dir+File.separator + dirsList[i]); // 7. иначе, проваливаемся глубже, передавая эту сущность аргументом в list()
            }
        }
    }
}

