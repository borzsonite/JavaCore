package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


/*
Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.

Пример:
InputStream последовательно возвращает четыре байта: 48 49 50 51.
Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку: "0123".
* **/

public class Task_5_3_11 {

    public static void main(String[] args) throws IOException {
        byte[] bb = new byte[] {48, 49, 50, 51}; //0, 1, 2, 3
        ByteArrayInputStream bis = new ByteArrayInputStream(bb); // создаем батовый стрим для чтения
        System.out.println(readAsString(bis, Charset.forName("ASCII")));
    }


    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        int ch = 0;
        StringBuilder str = new StringBuilder();
        Reader reader = new InputStreamReader(inputStream, charset);

        while ((ch = reader.read()) != -1) {
            str.append((char) ch);
        }
        return str.toString();
    }
}
