package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

public class Test4 {

    interface TestInterface {
        boolean testMethod(int var);
    }

    public static void main(String[] args) {
        TestInterface t4 = Helper::realMethod;
        System.out.println(t4.testMethod(3));

    }

}

class Helper {
    static boolean realMethod(int i) {
        return i%2 == 0;

    }
}

