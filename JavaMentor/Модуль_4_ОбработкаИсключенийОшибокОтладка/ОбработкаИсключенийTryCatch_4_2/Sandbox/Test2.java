package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.ОбработкаИсключенийTryCatch_4_2.Sandbox;

public class Test2 {

    static void demoproc() {

        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("caught inside demoproc");
            throw e;
        }
    }

    public static void main(String args[]) {

        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("recaught: " + e);
        }
    }
}
