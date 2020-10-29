package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorExample {
    static UnaryOperator<Double> sqrt = value-> Math.sqrt(value);
    static BinaryOperator<Integer> binaryOperator = (a, b) -> a*b;

    public static void main(String[] args) {
        System.out.println(sqrt.apply(4.0));
        System.out.println(binaryOperator.apply(5,5));
    }
}
