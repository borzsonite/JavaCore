package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by Alpha on 17.09.2020.
 */
public class Test5 {



    public static void main(String[] args) throws IOException {

        Path path = Paths.get("test.txt");

        Files.copy(Paths.get("test.txt"), Paths.get("test2.txt"), StandardCopyOption.REPLACE_EXISTING);
        System.out.println(Paths.get("test.txt"));

        System.out.println(Files.isReadable(path));
    }
}
