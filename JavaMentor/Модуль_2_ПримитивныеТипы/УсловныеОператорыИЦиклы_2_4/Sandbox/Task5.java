package JavaMentor.Модуль_2_ПримитивныеТипы.УсловныеОператорыИЦиклы_2_4.Sandbox;

import java.util.Arrays;

/**
 * Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.
 * <p>
 * Пример ввода: [3,5,20,8,7,3,100]
 * <p>
 * Пример вывода: 3,5,7,3
 */
public class Task5 {

    public static void main(String[] args) {
        printOddNumbers(new int[]{3, 5, 20, 8, 7, 3, 100});
    }

    public static void printOddNumbers(int[] arr) {
        //Твой код здесь
        StringBuilder sb = new StringBuilder();
        for (int elem : arr) {
            if (elem % 2 != 0) {
                sb.append(elem).append(",");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
        char[] dist =new char[3];

        sb.getChars(2,5, dist, 0);
        System.out.println(dist);
        System.out.println(Arrays.toString(dist));

    }
}
