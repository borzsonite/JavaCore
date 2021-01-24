package BaseJava.Lesson9.Sandbox.NIO;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test4 {
    public static void main(String[] args) {
        String file = "test.txt";
        Path dir = Paths.get("BaseJava\\Lesson9\\Sandbox\\NIO\\test.txt");
        System.out.println(dir);
        System.out.println(Paths.get(dir + File.separator + file).getFileName().toString());
    }
}
