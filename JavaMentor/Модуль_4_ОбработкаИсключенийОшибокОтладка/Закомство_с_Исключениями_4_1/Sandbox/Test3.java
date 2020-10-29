package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Закомство_с_Исключениями_4_1.Sandbox;
public class Test3 {
    public static void main(String[] args) {
        System.out.println("Call method from main()");
        System.out.println(getCaller());
        m1();
    }
    static void m1() {
        System.out.println("Call method from m1()");
        System.out.println(getCaller());
        m2();
    }

    static void m2() {
        System.out.println("Call method from m2()");
        System.out.println(getCaller());
    }

    public static String getCaller() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        for(StackTraceElement elem: stackTraceElements) {
            System.out.println(elem);
        }
        return "=====================================================================================================================";
    }

}
