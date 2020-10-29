package JavaMentor.Модуль_6_Generics_Collections.Collections_6_2.Sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.
 Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
 Все import объявлены за вас.
 */
public class Task_6_2_14 {
    public static void main(String[] args) {
        String res = "";
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");

        for(int i = str.length-1; i>0; i--) {
            if(i%2 != 0) {
                res+=str[i] + " ";
            }
        }
        System.out.println(res);
    }
}
