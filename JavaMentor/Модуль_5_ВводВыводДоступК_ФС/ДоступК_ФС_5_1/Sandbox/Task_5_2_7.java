package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.*;
import java.util.Arrays;

public class Task_5_2_7 {

    public static void main(String[] args) {
        byte[] arr = {1, 7, 5, -1, 4, 10};
        try {
            System.out.println(new Task_5_2_7().sumOfStream(new ByteArrayInputStream(arr)));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int count = 0;

        while ((count = inputStream.read()) != -1) {
            sum += ((byte) count);
        }
        return sum;
    }

    public static class Test15 {
        public static void main(String[] args) {
            byte[] b = {1,2,3,4,5,6,7,8,9,10,-2};
            byte[] dest = new byte[b.length];

            ByteArrayInputStream bos = new ByteArrayInputStream(b);
            while(bos.available() != 0) {
               // bos.read(dest, 3, 5);
                System.out.println(bos.read());

            }
            System.out.println(Arrays.toString(dest));
        }
    }

    public static class TinyEdit {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = new String[10];
            String line;
            int count = 0;
            while(!(line = br.readLine()).equals("exit")) {
                str[count++] = line;
            }
            for(String elem: str) {
                System.out.println(elem);
            }

            PrintStream ps = System.out;
        }

    }
}
