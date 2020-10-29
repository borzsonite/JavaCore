package JavaMentor.Модуль_2_ПримитивныеТипы.ПреобразованиеТипов_2_2.Sandbox;

/**
 * Created by Alpha on 24.08.2020.
 */
public class Task2 {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(131072));
    }

    public static boolean isPowerOfTwo(int value) {
        //Твой код здесь
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
