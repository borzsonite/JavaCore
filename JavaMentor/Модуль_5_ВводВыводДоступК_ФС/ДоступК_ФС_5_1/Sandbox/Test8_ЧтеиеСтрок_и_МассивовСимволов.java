package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Test8_ЧтеиеСтрок_и_МассивовСимволов {
    public static void main(String[] args) {
        int ch = 0;

        Reader reader = new StringReader("ы");
        try {
            while((ch=reader.read()) !=-1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
