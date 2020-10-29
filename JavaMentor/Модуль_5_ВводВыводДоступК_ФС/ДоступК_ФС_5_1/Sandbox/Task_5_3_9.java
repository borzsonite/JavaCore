package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.util.Arrays;

public class Task_5_3_9 {
    public static void main(String[] args) {
        String str = "?";
        byte[] b1 = str.getBytes();
        System.out.println(Arrays.toString(b1));
        System.out.println(b1[0]);
        System.out.println(Integer.toBinaryString(-117));
        System.out.println();

        String s = "?";
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(((int) b[i] ^ -1 << 8) + " ");
        }
    }
}