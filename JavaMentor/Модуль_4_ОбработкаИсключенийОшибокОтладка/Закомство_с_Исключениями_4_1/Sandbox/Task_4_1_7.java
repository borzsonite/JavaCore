package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Закомство_с_Исключениями_4_1.Sandbox;

/**
 Создайте новое проверяемое исключение MyNewException, и создайте метод testExp(), который выбрасывает MyNewException при вызове.

 Требования:
 1. Метод testExp() должен быть публичным и иметь тип возвращаемого значения void.
 2. Класс исключения должен иметь модификатор доступа по умолчанию.
 3. Метод testExp() расположите вне класса исключения.
 */
public class Task_4_1_7 {
    public static void main(String[] args) throws MyNewException  {
        Task_4_1_7 test = new Task_4_1_7();
        test.testExp();
    }

    public void testExp() throws MyNewException {
        throw new MyNewException("This is MyNewException");
    }
}

class MyNewException extends Exception {

   public MyNewException (String message) {
       super(message);
   }
}

