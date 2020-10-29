package JavaMentor.Модуль_2_ПримитивныеТипы.УсловныеОператорыИЦиклы_2_4.Sandbox;

import java.math.BigInteger;

/**
 * Created by Alpha on 26.08.2020.
 */
public class Test2 {
    public static void main(String[] args) {
        BigInteger value = new BigInteger("32145");
        byte b1 = value.byteValueExact();
        System.out.println(b1);
    }
}
