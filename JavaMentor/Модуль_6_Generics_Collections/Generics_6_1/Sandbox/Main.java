package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox;

/**
 * Created by Alpha on 09.10.2020.
 */
public class Main {
    public static void main (String[] args) {
        test1<Integer> t = new test1<>(); // задали тип Integer,  компилятор не ругается, потому что метод getT должен будет вернуть тоже Integer
        Integer a = t.getT(); // ошибка java.lang.ClassCastException проявится уже тут при исполнении. Когда у нас есть переменная Integer, а привязываем ей полученный объект "hello".
    }

    static class test1<T> {
        private T x;
        test1() {
 //x = "hello"; // компилятор заметит ошибку, т.к. переменная требует тип Т, а передаем ей тип String.
         //   x = (T) "hello"; // тут компилятор не выдает ошибки. И даже во время исполнения все ок, хотя мы задали Т как Integer, но JVM видит это как Object x = "hello"
        }

        public T getT() {
            return x; // тоже все нормально во время выполнения, хотя мы возвращаем строку "hello", а не Integer. Потому что это для JVM выглядит как public Object getT()
        }
    }
}
