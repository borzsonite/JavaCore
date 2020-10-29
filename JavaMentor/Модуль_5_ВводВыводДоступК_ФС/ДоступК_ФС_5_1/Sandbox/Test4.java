package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

/**
 * Created by Alpha on 17.09.2020.
 */

import java.nio.file.*;

public class Test4 {
    public static void main(String[] args) {
        Path path1 = Paths.get("test.txt");
        Path path2 = Paths.get("C:\\Users\\Alpha\\YandexDisk\\java\\test.txt");
        System.out.println("(path1.compareTo(path2) == 0) is: "
                + (path1.compareTo(path2) == 0));
        System.out.println("path1.equals(path2) is: " + path1.equals(path2));
        System.out.println("path2.equals(path1.toAbsolutePath()) is "
                + path2.equals(path1.toAbsolutePath()));

        System.out.println(path1.toAbsolutePath());

        System.out.println(path2.toAbsolutePath());
    }
}

