package JavaMentor.BooksShild.chapter3.Переменные.Sandbox;

public class Test2 {

    public static void main(String[] args) {
        int x = 3;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y=" + y);
            y = 100;
            System.out.println("y=" + y);
        }

        int a = 257;
        System.out.println(a%256);
        byte b = (byte) a;
        System.out.println(b);
    }
}


