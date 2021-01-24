package BaseJava.Lesson9.Sandbox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws IOException {

        byte[] bytesToWrite = {1, 2, 3};
        byte[] bytesReaded = new byte[10];
        String fileName = "BaseJava\\Lesson9\\Sandbox\\test.txt";
        try {
            // 1. Открываем выходной поток, в который передается имя файла в котороый будет производиться запись
            FileOutputStream outFile = new FileOutputStream(fileName); // пукнт назначения - fileName, в него будут записаны данные
            System.out.println("Файл открыт для записи");

            // Записать массив
            outFile.write(bytesToWrite); // 2. В метод write() потока передаем массив данных который будет записан в файл
            System.out.println("Записано: " + bytesToWrite.length + " байт");

            // 3. По окончании использования должен быть закрыт
            outFile.close();
            System.out.println("Выходной поток закрыт");

            // Создать входной поток, в который передается имя файла
            FileInputStream inFile = new FileInputStream(fileName);
            System.out.println("Файл открыт для чтения");

            // Узнать, сколько байт готово к считыванию
            int bytesAvailable = inFile.available();
            System.out.println("Готово к считыванию: " + bytesAvailable + " байт");

            // Считать в массив
            int count = inFile.read(bytesReaded,0,bytesAvailable); // bytesReaded - массив в который будет запись
            System.out.println("Считано: " + count + " байт");
            for (int i=0;i<count;i++)
                System.out.print(bytesReaded[i]+",");
            System.out.println();
            inFile.close();
            System.out.println("Входной поток закрыт");
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести запись в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());
        }

        /////////////my turn
        /**
         * 1. Источник - массив байт
         * 2. Создать поток в который передать источник.
         * 3. Записать поток в файл
         * */

        byte[] src =  {12,4,7};
        String file = "BaseJava\\Lesson9\\Sandbox\\file.txt";
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(src);
        fos.close();

        FileInputStream fis = new FileInputStream(file);
        int count = fis.available();
        byte[] dest = new byte[count];
        fis.read(dest, 0, count);
        System.out.println(Arrays.toString(dest));
        fis.close();
    }
}
