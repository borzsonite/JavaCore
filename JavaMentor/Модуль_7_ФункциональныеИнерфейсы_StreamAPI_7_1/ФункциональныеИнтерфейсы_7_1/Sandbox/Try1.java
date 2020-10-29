package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

/**
 * Задача передать в метод лябмбду которая реализует метод ФИ
 * 1. Реализуем ФИ
 * 2. В методе main создаем переменную типа ФИ в которую записываем лямбду
 * 3. Создаем метод принимающй в качестве пораметра переменную типа ФИ
 * 4. В этом методе на перменной
 */

public class Try1 {
    public static void main(String[] args) {
        Predicate predicate = n -> n > 10;
        int[] array = {1, 4, 20, 15, 7, 18};
        getResult(array, predicate);
    }

    public static void getResult(int[] array, Predicate predicate) {
        int result = 0;
        for (int elem : array) {
            if (predicate.isMoreThenTen(elem)) {
                result += elem;
            }
        }
        System.out.println(result);
    }

}

interface Predicate {
    boolean isMoreThenTen(int val);
}
