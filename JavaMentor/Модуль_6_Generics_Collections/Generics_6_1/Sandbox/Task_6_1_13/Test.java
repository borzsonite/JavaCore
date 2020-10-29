package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Task_6_1_13;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int [] arr2 = new int[10];
        System.arraycopy(arr1, 2, arr1, 1, 3 );
        System.out.println(Arrays.toString(arr1));
        arr1 = Arrays.copyOf(arr1, 15);
        System.out.println(Arrays.toString(arr1));
    }
}
