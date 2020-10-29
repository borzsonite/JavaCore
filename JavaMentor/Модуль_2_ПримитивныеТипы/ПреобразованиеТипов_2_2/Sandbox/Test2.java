package JavaMentor.Модуль_2_ПримитивныеТипы.ПреобразованиеТипов_2_2.Sandbox;

public class Test2 {
    public static void main(String[] args) {
        int a = 2051;
        byte b = (byte)a;
        System.out.println(b); // 3 старшие биыт отбрасываются и остаются 0000 0011 в младших разрядах
        double d = Double.MAX_VALUE;
        double res = d *2;
        System.out.println(res);

        int i2 = 32;
        float f = i2;
        System.out.println(f);
    }
}
