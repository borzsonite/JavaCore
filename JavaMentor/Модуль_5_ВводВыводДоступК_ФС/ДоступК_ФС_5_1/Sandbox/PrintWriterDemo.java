package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Hello");
        pw.println(2);
        pw.println(2.3);


        Path paths = Paths.get("superNewDir");
        try{
           // Files.createDirectory(Paths.get("anotherDir"));
            Files.deleteIfExists(Paths.get("dirName"));

        } catch (IOException e) {

        }
    }
}
