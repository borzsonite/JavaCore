package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Task_7_1_8;

/**
 * Создайте функциональный интерфейс NumberGenerator, параметризованный таким образом, что принимает только наследников класса Number, имеющий метод boolean cond(T arg).
 * <p>
 * Создайте в методе public static NumberGenerator<? super Number> getGenerator() с помощью лямбда выражения реализацию NumberGenerator, которая возвращает true, если число в int эквиваленте больше 0.
 */

public class Task_7_1_8 {

    @FunctionalInterface
    public interface NumberGenerator<T extends Number> {
        boolean cond(T arg);
    }

    public static void main(String[] args) {
        //При правильной реализации следующий код должен возвращать 4 раза true и 5 раз false.
        NumberGenerator numGen = getGenerator();
        System.out.println(numGen.cond(123456L));
        System.out.println(numGen.cond(123456.56));
        System.out.println(numGen.cond(132));
        System.out.println(numGen.cond(Byte.MAX_VALUE));
        System.out.println(numGen.cond(-5.5));
        System.out.println(numGen.cond(-1253523525L));
        System.out.println(numGen.cond(0));
        System.out.println(numGen.cond(-2));
        System.out.println(numGen.cond(Byte.MIN_VALUE));
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return arg -> arg.intValue() > 0 ? true : false;
    }
}
