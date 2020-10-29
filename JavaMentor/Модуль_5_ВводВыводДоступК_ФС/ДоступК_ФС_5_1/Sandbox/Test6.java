package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test6 {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\aberrate\\YandexDisk\\javaMentor\\test.txt"); // получаем экземпляр path

        FileInputStream fis = null;
        int b = 0;

        try {
             fis = new FileInputStream("test.txt");

            while ((b=fis.read()) !=-1){
                System.out.print((char) b);

            } // метод read() возвращает 1 байт из файла, поэтому его нужно использовать в цикле
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
