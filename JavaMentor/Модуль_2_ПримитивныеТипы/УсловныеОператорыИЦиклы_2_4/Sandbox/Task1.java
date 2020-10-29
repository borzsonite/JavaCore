package JavaMentor.Модуль_2_ПримитивныеТипы.УсловныеОператорыИЦиклы_2_4.Sandbox;

import java.math.BigInteger;

/**
 * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
 * <p>
 * Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
 * <p>
 * Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 * <p>
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 * <p>
 * Пример ввода 1: 1
 * Пример возвращаемого значения 1: 1
 * <p>
 * Пример ввода 2: 3
 * Пример возвращаемого значения 2: 6
 */
public class Task1 {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {
        //Твой код здесь
        int count = 1;
        BigInteger result = BigInteger.ONE;
        while (count <= value) {
            result = result.multiply(BigInteger.valueOf(count));
            count++;
        }
        return result;
    }
}
