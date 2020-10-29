package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;

public class Test1 {


    public static void main(String[] args) throws IOException {
        System.out.println(File.pathSeparatorChar);
        File file = new File("!!!readme.txt");
       // System.out.println(file.getAbsolutePath());
      //  System.out.println(file.getCanonicalPath());
        file.createNewFile();

        File file1 = new File(".\\a\\b\\..\\b\\c\\.\\file.txt");
        File file2 = new File("a\\b\\c\\file.txt");
        System.out.println(file1.getCanonicalPath().equalsIgnoreCase(file2.getCanonicalPath()));

    }

}
