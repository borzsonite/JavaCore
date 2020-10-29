package JavaMentor.Модуль_2_ПримитивныеТипы.ПреобразованиеТипов_2_2.Sandbox;

import static java.lang.Integer.parseInt;

public class Test1 {


    public static void main(String[] args) {
        int i = 5;
        long l = 335_555_558_888_888_888_2L;
        float f = i;
        float f1 = l;
        Character ch1 = 'ф';
        System.out.println(ch1.isLetter(ch1));

        System.out.println(Float.POSITIVE_INFINITY); //Infinity
        System.out.println(Double.NaN); //NaN
        System.out.println(Double.isNaN(Double.NaN)); //true

        System.out.println(f1);
        f1 = 45.7f;
        System.out.println(f1);
        byte b1 = 100;
        byte b2 = 3;
        byte b3 = (byte) (b1 + b2);

        int i3 = 298765421;
        long l3 = 532523l;

        float f4 = i3; // float <-- int
        f4 = l3;


        short s3 = (short) i3;
        System.out.println("s3=" + s3);

        Integer ref = i;
        Integer a = Integer.valueOf(1);
        int b = a.intValue();
        System.out.println(b);
        Integer c = 1;
        int z = c;
        System.out.println(c);
        Integer int1 = new Integer(40);
        System.out.println("!!!" + int1.highestOneBit(int1));

        long val = Long.parseLong("123");
        System.out.println(val *2);
        System.out.println("area " + 51);
        System.out.println(Long.toString(val));
        System.out.println(c.MAX_VALUE);

        int val1 = 1024; //0100 0000 0000
        byte b4 = (byte) val1;
        System.out.println(b4); // приведение более емкого типа int к менее емкому byte - старшие типы отбрасываются.






    }
}
