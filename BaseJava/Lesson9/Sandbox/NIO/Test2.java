package BaseJava.Lesson9.Sandbox.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        System.out.println(file.getAbsolutePath());
        Path path1 = Paths.get("test.txt");
        Path path2 = Paths.get("BaseJava\\Lesson9\\Sandbox\\NIO\\test.txt");
        System.out.println(path2.getRoot());
        System.out.println("Files.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2));
        System.out.println(Files.getAttribute(path2, "creationTime"));
    }
}
