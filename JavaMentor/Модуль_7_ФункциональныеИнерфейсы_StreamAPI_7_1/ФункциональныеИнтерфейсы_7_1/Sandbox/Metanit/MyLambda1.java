package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Metanit;

/**
 * Created by Alpha on 07.10.2020.
 */
public class MyLambda1 {

    @FunctionalInterface
    interface Express {
        boolean action(int var);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Express func = (s) -> s % 2 == 0; // можно не записывать в переменную а передать в метод как есть, лямбдой
        sum(arr, func);
        sum(arr, s -> s % 2 == 0);

    }

    public static void sum(int[] arr, Express e) {
        int result = 0;
        for (int elem : arr) {
            if (e.action(elem)) {
                result += elem;
            }

        }
        System.out.println(result);
    }
}
