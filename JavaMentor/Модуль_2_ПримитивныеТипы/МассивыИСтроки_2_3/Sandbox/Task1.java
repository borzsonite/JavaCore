package JavaMentor.Модуль_2_ПримитивныеТипы.МассивыИСтроки_2_3.Sandbox;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat i saw"));

    }

    public static boolean isPalindrome(String text) {
        //Твой код здесь
        StringBuffer stb = new StringBuffer(text.replaceAll("[^a-zA-Z0-9]", ""));
        return stb.reverse().toString().equalsIgnoreCase(text.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
