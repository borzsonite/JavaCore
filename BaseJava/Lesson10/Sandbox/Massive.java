package BaseJava.Lesson10.Sandbox;

import java.util.Arrays;
public class Massive {
    public static void main(String[] args) {
        int number = 6;
        int[] array = new int[number/2];
        for (int i = 1; i < array.length; i++) {
            if (i%2==0) {
                array[i] = i;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
