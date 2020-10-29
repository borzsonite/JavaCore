package JavaMentor.Модуль_2_ПримитивныеТипы.ПреобразованиеТипов_2_2.Sandbox;

public class Task3 {
    public static void main(String[] args) {
        float floatVar = 922l;
        long  longVar = 9223372036854775807l;
        floatVar = longVar;
        System.out.println("floatVar=" + floatVar);
        System.out.println("longVar=" + longVar);
    }
}
