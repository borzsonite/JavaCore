package BaseJava.Lesson9.Sandbox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {

        byte[] bytesToWrite = {1, 2, 3};
        byte[] bytesReaded = new byte[10];
        String fileName = "BaseJava\\Lesson9\\Sandbox\\test.txt";
        try {
            // Создать выходной поток
            FileOutputStream outFile = new FileOutputStream(fileName);
            System.out.println("Файл открыт для записи");

            // Записать массив
            outFile.write(bytesToWrite);
            System.out.println("Записано: " + bytesToWrite.length + " байт");

            // По окончании использования должен быть закрыт
            outFile.close();
            System.out.println("Выходной поток закрыт");

            // Создать входной поток
            FileInputStream inFile = new FileInputStream(fileName);
            System.out.println("Файл открыт для чтения");

            // Узнать, сколько байт готово к считыванию
            int bytesAvailable = inFile.available();
            System.out.println("Готово к считыванию: " + bytesAvailable + " байт");

            // Считать в массив
            int count = inFile.read(bytesReaded,0,bytesAvailable);
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
    }
}
