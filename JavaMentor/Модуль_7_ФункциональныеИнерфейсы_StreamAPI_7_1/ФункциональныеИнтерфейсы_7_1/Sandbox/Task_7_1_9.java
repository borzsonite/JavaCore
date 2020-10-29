package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 Дан предикат condition и две функции ifTrue и ifFalse. Напишите метод ternaryOperator, который из них построит новую функцию, возвращающую значение функции ifTrue, если предикат выполнен, и значение ifFalse иначе.

 Результирующая функция будет для нулевых ссылок на String возвращать 0, а для ненулевых ссылок возвращать длину строки.
 * */

public class Task_7_1_9 {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        Predicate<Object> condition1 = (Object) -> {
            return Object == null ? true : false;
        };
        System.out.println(condition1.test(new String("Hello")));

        Function<Object, Integer> ifTrue = obj -> 0; // функция принимает object, возвращает integer
        Function<CharSequence, Integer> ifFalse = CharSequence::length; // функция принимает строку, возвращает длину
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse); // фукнция принимает строку возвращает integer
        System.out.println(ifTrue.apply("Hello world!"));
    }
    //                                      название метода                  параметр1                                   параметр 2                               параметр 3
    //                                          V                                V                                          V                                         V
    public static <T, U> Function<T, U> ternaryOperator(Predicate<? super T> condition, Function<? super T, ? extends U> ifTrue, Function<? super T, ? extends U> ifFalse) {
        //Твой код здесь
       return s -> condition.test(s)?ifTrue.apply(s):ifFalse.apply(s);

    }
}
