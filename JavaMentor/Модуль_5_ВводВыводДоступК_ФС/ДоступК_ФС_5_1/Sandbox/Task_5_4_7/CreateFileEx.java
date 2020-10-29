package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox.Task_5_4_7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Есть 3 спросоаба создания файла
* **/

public class CreateFileEx {
    public static void main(String[] args) throws IOException {
        ///////////Способ #1//////////
        File file = new File("test5.txt");
        file.createNewFile();

        ///////////Способ #2//////////
        FileOutputStream fos = new FileOutputStream("test6.txt"); // Создаем файл
        fos.write(new byte[]{1,2,3,4}); // и записываем в него
        fos.flush();
        fos.close();

        ///////////Способ #3//////////
        Path path = Paths.get("test7.txt");
        Files.createFile(Paths.get("test8.txt"));

        //////////Создание директории///////////
        Files.createDirectory(Paths.get("tempDir100"));
    }
}
