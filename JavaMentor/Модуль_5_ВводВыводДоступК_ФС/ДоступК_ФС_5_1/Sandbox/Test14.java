package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Alpha on 23.09.2020.
 */
public class Test14 {

    public static void main(String[] args) {
        Path p = Paths.get("noexists.txt");
        Path name = p.getFileName();
        boolean exists = Files.exists(p);
        System.out.println(name);
        System.out.println(exists);
        try {
            Files.delete(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

       // OutputStream b = new BufferedOutputStream();
    }
}
