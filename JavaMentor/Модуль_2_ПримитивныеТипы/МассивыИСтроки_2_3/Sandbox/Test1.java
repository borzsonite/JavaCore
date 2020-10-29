package JavaMentor.Модуль_2_ПримитивныеТипы.МассивыИСтроки_2_3.Sandbox;

import java.util.Arrays;

public class Test1 {


    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        int[] arr2 = new int[] {1,2,3};
        int[] arr3 = new int[10];

        System.out.println(Arrays.equals(arr, arr2));

        char[] chars = {'a', 'b', 'c'};
        String str = new String(chars);
        System.out.println(str);
        char[] chars1 = str.toCharArray();
        System.out.println(Arrays.toString(chars1));
        System.out.println(('\t' + '\u0003'));
        System.out.println('A' + "12");
        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        String s4 = s3.intern();
        System.out.println(s1==s4);
    }
}
