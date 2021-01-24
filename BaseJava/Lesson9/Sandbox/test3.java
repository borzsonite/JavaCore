package BaseJava.Lesson9.Sandbox;

import java.io.*;

public class test3 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            String fileName = "file1.txt";
            InputStream inStream = null;
            OutputStream outStream = null;

            //Записать в файл некоторое количество байт
            long timeStart = System.currentTimeMillis();
            //outStream = new FileOutputStream(fileName);
            //outStream = new BufferedOutputStream(outStream);
            // outStream = new BufferedOutputStream(new FileOutputStream(fileName));
            outStream = new FileOutputStream(fileName);

            for(int i=1000000; --i>=0;) {
                outStream.write(i);
            }
            long time = System.currentTimeMillis() - timeStart;
            System.out.println("Writing time: " + time + " millisec");
            outStream.close();

            // Определить время считывания без буферизации
            timeStart = System.currentTimeMillis();
            inStream = new FileInputStream(fileName);
            while(inStream.read()!=-1){
            }
            time = System.currentTimeMillis() - timeStart;
            inStream.close();
            System.out.println("Direct read time: " + (time) + " millisec");

            // Теперь применим буферизацию
            timeStart = System.currentTimeMillis();
            inStream = new FileInputStream(fileName);
            inStream = new BufferedInputStream(inStream);
            while(inStream.read()!=-1){
            }
            time = System.currentTimeMillis() - timeStart;
            inStream.close();
            System.out.println("Buffered read time: " + (time) + " millisec");
        } catch (IOException e) {
            System.out.println("IOException: " + e.toString());
            e.printStackTrace();
        }
    }
}
