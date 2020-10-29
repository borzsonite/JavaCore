package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Created by Alpha on 21.09.2020.
 */
public class Test9_ЧтениеИзФайла {

    public static void main(String[] args) throws IOException{
        File path = new File("test2"); // старый вариант

        Path path2 = Paths.get("test"); // новый вариант
        //System.out.println(path2.isAbsolute());


        // Примеры работы с классом Files https://javarush.ru/groups/posts/2275-files-path

        //создание файла
        Path testFile1 = Files.createFile(Paths.get("C:\\Users\\Alpha\\Desktop\\testFile111.txt"));
        System.out.println("Был ли файл успешно создан?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Alpha\\Desktop\\testFile111.txt")));

//        //создание директории
//        Path testDirectory = Files.createDirectory(Paths.get("C:\\Users\\Alpha\\Desktop\\testDirectory"));
//        System.out.println("Была ли директория успешно создана?");
//        System.out.println(Files.exists(Paths.get("C:\\Users\\Alpha\\Desktop\\testDirectory")));
//
//        //перемещаем файл с рабочего стола в директорию testDirectory. Перемещать надо с указанием имени файла в папке!
//        testFile1 = Files.move(testFile1, Paths.get("C:\\Users\\Alpha\\Desktop\\testDirectory\\testFile111.txt"), REPLACE_EXISTING);
//
//        System.out.println("Остался ли наш файл на рабочем столе?");
//        System.out.println(Files.exists(Paths.get("C:\\Users\\Alpha\\Desktop\\testFile111.txt")));
//
//        System.out.println("Был ли наш файл перемещен в testDirectory?");
//        System.out.println(Files.exists(Paths.get("C:\\Users\\Alpha\\Desktop\\testDirectory\\testFile111.txt")));
//
//        //удаление файла
//        Files.delete(testFile1);
//        System.out.println("Файл все еще существует?");
//        System.out.println(Files.exists(Paths.get("C:\\Users\\Alpha\\Desktop\\testDirectory\\testFile111.txt")));


        // Пример копирования файлов

        //копируем файл с рабочего стола в директорию testDirectory2.
        testFile1 = Files.copy(testFile1, Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2\\testFile111.txt"), REPLACE_EXISTING);

        System.out.println("Остался ли наш файл на рабочем столе?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testFile111.txt")));

        System.out.println("Был ли наш файл скопирован в testDirectory?");
        System.out.println(Files.exists(Paths.get("C:\\Users\\Username\\Desktop\\testDirectory2\\testFile111.txt")));



    }
    }

