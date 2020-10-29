package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.*;

public class Test7_ЧтениеИзФайла_ЧтениеСтрок {

    public static void main(String[] args) {
        File file = new File("test.txt");
        int b = 0;
        FileInputStream fis = null; // переменная для чтенния из файла
        InputStreamReader isr = null; // переменная для объекта чтения из строки

        try {
            fis = new FileInputStream("test.txt"); // создаем объект для чтения из файла
            isr = new InputStreamReader(fis, "UTF-8"); // создаем объект для чтения строки, которая в конструктор принимает объект чтения из файла
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            while ((b = isr.read()) != -1) { // присваиваем в переменную b, то что было прочитано из файла и если это не конец файла (-1)
                System.out.println((char)b); // кастим прочитанный байт в char и выводим в консоль
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close(); // закрываем поток
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close(); // закрываем поток
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
