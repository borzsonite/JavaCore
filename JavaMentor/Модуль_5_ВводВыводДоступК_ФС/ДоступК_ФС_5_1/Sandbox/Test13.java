package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox;

import java.util.Arrays;

/**
 проверка на изменения в массиве за пределами метода, вопрос с ревью по 3 модулю.
 */
public class Test13 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        changeArrar(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        Test13 ob = new Test13();
        System.out.println(ob.getClass());

    }


   static void changeArrar(int[] array) {
        array[0]=2;
        System.out.println(Arrays.toString(array));
    }
}
