package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test8_Запись_в_Файл {

    public static void main(String[] args) {
        Writer fwr = null;
        String str = "ы";
        int ch = 0;

        try {
            Reader reader = new InputStreamReader(
                    new FileInputStream("test.txt"), StandardCharsets.UTF_8);
            while ((ch = reader.read()) != -1) {
                System.out.print((byte) ch);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            fwr = new FileWriter("test.txt", true);
            fwr.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fwr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
