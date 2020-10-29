package JavaMentor.Модуль_2_ПримитивныеТипы.УсловныеОператорыИЦиклы_2_4.Sandbox;

import java.math.BigInteger;

/**
 * Created by Alpha on 02.09.2020.
 */
public class Recursion {
    private static int value = 0;

    public static void main(String[] args) {
        //someMethod(3);
        System.out.println(factorial(0));
        System.out.println(factoriall(0));
    }

    public static void someMethod(int count) {
        if (count == 0) {
            return;
        }
        System.out.println(count);

        someMethod(count - 1);
    }

    public static int factoriall(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factoriall(n - 1);
    }

    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
}
