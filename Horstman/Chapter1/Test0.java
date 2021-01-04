package Horstman.Chapter1;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class Test0 {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Math.abs(new Random().nextInt()));
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
    }
}
