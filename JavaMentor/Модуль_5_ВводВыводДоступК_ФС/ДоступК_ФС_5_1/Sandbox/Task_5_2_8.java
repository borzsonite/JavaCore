package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Напишите метод void print(InputStream inputStream, OutputStream outputStream) который принимает InputStream и OutputStream, считывает все байты из inputStream и записывает в OutputStream только четные.
 * <p>
 * Пример ввода: 3, 10, 4, 5, 7
 * Пример вывода: 10, 4
 */
public class Task_5_2_8 {

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] b = {3, 10, 4, 5, 7};
        int count = 0;

        while ((count = inputStream.read()) != -1) {
            if ((byte) count % 2 == 0) {
                outputStream.write((byte) count);
            }
        }
        outputStream.flush();
    }
}
