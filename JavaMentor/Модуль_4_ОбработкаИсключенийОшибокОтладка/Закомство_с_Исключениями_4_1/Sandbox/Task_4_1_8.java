package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Закомство_с_Исключениями_4_1.Sandbox;

import java.util.Arrays;

/**
 * Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
 * Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.
 * Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод, откуда сообщение было залогировано.
 */
public class Task_4_1_8 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod1();
    }

    private static void anotherMethod1() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        String className = "";
        String methodName = "";

        if (stackTraceElements.length < 3) {
            return null;
        } else {
            className = stackTraceElements[2].getClassName();
            methodName = stackTraceElements[2].getMethodName();
            return className + "#" + methodName;

        }
    }
}
