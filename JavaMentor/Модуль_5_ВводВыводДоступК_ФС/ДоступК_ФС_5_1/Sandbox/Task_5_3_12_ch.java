package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.io.*;
import java.nio.*;
import java.util.*;

/**
 * Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных в тексте вещественных чисел с точностью до шестого знака после запятой. Числом считается последовательность символов, отделенная от окружающего текста пробелами или переводами строк и успешно разбираемая методом Double.parseDouble.
 * <p>
 * На этот раз вам надо написать программу полностью, т.е. объявить  публичный класс с именем Main  и точку входа в программу — метод  main. И добавить все необходимые импорты
 */

public class Task_5_3_12_ch {

    static class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double sum = 0;
            String str = "";

            while (scanner.hasNext()) {
                str += scanner.nextLine() + " ";
            }

            String[] vals = str.split(" ");

            for (int i = 0; i<vals.length; i++) {
                try {
                    sum += Double.parseDouble(vals[i]);
                } catch (NumberFormatException e) {
                    continue;
                }
            }
            System.out.printf(Locale.US, "%.6f", sum);
        }
    }
}
