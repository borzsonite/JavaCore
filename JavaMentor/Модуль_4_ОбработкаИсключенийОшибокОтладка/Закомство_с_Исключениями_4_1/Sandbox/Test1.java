package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Закомство_с_Исключениями_4_1.Sandbox;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(getRes(0));;
    }

    static int getRes(int a) {

        try{
           return 10/a;
        } catch (ArithmeticException e) {
           // StackTraceElement element = getStackTrace();
        }
        return 10/a;
    }
}
