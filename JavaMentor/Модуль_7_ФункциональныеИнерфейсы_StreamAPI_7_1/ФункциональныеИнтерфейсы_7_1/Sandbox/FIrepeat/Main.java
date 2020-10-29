package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.FIrepeat;

import java.util.function.*;

/**
 * Пять семейств ФИ:
 */
public class Main {

    // Помимо основных 5 ФИ интерфейсов можно делать свои
    @FunctionalInterface
    static interface MyFunctionalInterface<T> { // создаем ФИ
        T getResult(T val1, T val2);
    }

    public static void main(String[] args) {

        MyFunctionalInterface<Integer> count = (a, b) -> a + b;
        System.out.println(count.getResult(2, 3));


        ////////////////1. Consumer//////////////
        //* 1. Consumer<T> только принимает значения но ничего не возвращает. Есть BiConsumer - принимает два значения, есть IntConsumer, DoubleConsumer, LongConsumer*/
        Consumer<Integer> sqrt = a -> System.out.println(a * a);
        sqrt.accept(5);
// получается, что лямбда знает, что у sqrt есть единственный абстрактный метод .acept(), в который нужно передать логику из правой части лямбды.
        // В правой части лямбды - реализация абстрактного метода ФИ


        Consumer<Integer> sqrt1 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer * integer);
            }
        };
        sqrt1.accept(6);

        BiConsumer<String, String> val = (a, b) -> {
            String res = a.toUpperCase() + " " + b.toUpperCase();
            System.out.println(res);
        };
        val.accept("Hello ", "world!");

        IntConsumer value1 = a -> System.out.println(a * a); // параметризовать не надо
        value1.accept(7);

        ////////////////2. Supplier/////////////////
        /**
         Ничего не принимает, только возвращает. Есть IntSupplier, DoubleSupplier, LongSupplier, BooleanSupplier
         * */
        Supplier<Double> mySupplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.sqrt(25);
            }
        };
        System.out.println(mySupplier.get());

        Supplier<Double> anotherSupplier = () -> Math.sqrt(25);
        System.out.println(anotherSupplier.get());

        ////////////3. Predicate////////////
        //Принимает значение и возвращает булевское значение
        Predicate<String> predicate =  s -> s.equals("Hello");
        System.out.println(predicate.test("Hello!"));


        /////////////////4. Function////////////
        //Выполняет операции по преобразованию объектов одного типа в другой.
        Function<Double, Integer> convert = aDouble -> aDouble.intValue();
        System.out.println(convert.apply(5.0));

        /////////////////5. Operator////////////
        //Частный случай Function, принимает у возвращает значения одного типа
        UnaryOperator<String> unaryOperator = s -> s + "!!!";
        System.out.println(unaryOperator.apply("Hello"));

        BinaryOperator<Double> binaryOperator = (a, b) ->  a + b;
        System.out.println(binaryOperator.apply(2.0, 3.0));

    }
}
