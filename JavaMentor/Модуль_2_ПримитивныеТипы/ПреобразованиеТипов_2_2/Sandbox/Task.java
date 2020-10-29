package JavaMentor.Модуль_2_ПримитивныеТипы.ПреобразованиеТипов_2_2.Sandbox;


/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */

public class Task {

    float f = 1.4342f;
    double d = f;
    static char ch = 'v';
    static int in = ch;
    static float fl;



    public static void main(String[] args) {
        System.out.println(charExpression(5));
        System.out.println(in);
        float d = 214748.0f;
        short in = (short) d;
        System.out.println(in);
        fl = 9223372036854775807l;
        System.out.println(fl);

        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = 4;

        System.out.println(i1 == i2);

        i1 = 1000;
        i2 = 1000;

        System.out.println(i1 == i2);
        System.out.println(Integer.bitCount(2));


    }

    public static char charExpression(int a) {
        //Твой код здесь
        char s = '\\';
        System.out.println((int)s); // вывод индекса unicode
        System.out.println('\\' + a);
        return (char) ('\\' + a);
    }
}
