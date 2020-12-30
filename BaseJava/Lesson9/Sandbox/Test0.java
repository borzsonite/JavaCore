package BaseJava.Lesson9.Sandbox;
// https://www.youtube.com/watch?v=FWAQ3AW9vQM follow white rabbit

import java.io.*;

public class Test0 {

    public static void main(String[] args) throws IOException {
        //Чтение из файла
        String fileName = "C:\\Users\\aberr\\YandexDisk\\JavaCore\\BaseJava\\Lesson9\\Sandbox\\test.txt";
        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        int value = isr.read();
        while(value !=-1) {
            System.out.println((char) value);
            value = isr.read();
        }
        try(FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.write(" Hot jAVA");
        }
    }
}
