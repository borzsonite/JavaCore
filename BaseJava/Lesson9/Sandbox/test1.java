package BaseJava.Lesson9.Sandbox;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        byte[] bytes = {1,-2,0};
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        int readedInt = in.read(); // readedInt=1
        System.out.println("first element read is: " + readedInt);

        readedInt = in.read(); // readedInt=255. Однако (byte)readedInt даст значение -1
        System.out.println("second element read is: "+ readedInt);

        readedInt = in.read(); // readedInt=0
        System.out.println("third element read is: " + readedInt);


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(10); // записываем байт в поток
        out.write(11);
        byte[] bytes2 = out.toByteArray(); // записываем из потока в массив
        System.out.println(Arrays.toString(bytes2));
    }
}
