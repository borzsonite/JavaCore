package JavaMentor.Модуль_2_ПримитивныеТипы.УсловныеОператорыИЦиклы_2_4.Sandbox;

import java.util.Arrays;

/**
 Напишите метод evenArray который принимает целое число типа int и возвращает массив заполненный четными числами от 1 до этого числа.

 Пример ввода: 8
 Пример вывода: [2,4,6,8]
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(evenArray(10)));
    }

    public static int[] evenArray(int number) {
        //Твой код здесь
        int[] arr = new int[number/2];
        int index = 0;

        for (int i=1; i<=number; i++) {
            if(i%2 == 0 ) {
                arr[index]=i;
                index++;
            }
        }
        return arr;
    }
}
