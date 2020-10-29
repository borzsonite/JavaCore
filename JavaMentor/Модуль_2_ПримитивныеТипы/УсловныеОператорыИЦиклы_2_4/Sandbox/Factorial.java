package JavaMentor.Модуль_2_ПримитивныеТипы.УсловныеОператорыИЦиклы_2_4.Sandbox;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {
        //Твой код здесь
        BigInteger val = BigInteger.ONE;

        for(int i=1; i<=value; i++) {
            val = val.multiply(BigInteger.valueOf(i));
        }
        return val;
    }
}
