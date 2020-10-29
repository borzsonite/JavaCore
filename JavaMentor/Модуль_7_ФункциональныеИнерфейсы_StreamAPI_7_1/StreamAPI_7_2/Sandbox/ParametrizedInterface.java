package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.util.function.Consumer;

/**
 * Created by Alpha on 13.10.2020.
 */
public class ParametrizedInterface {

    interface Runable<T> { // есть парметризованный интерфейс
        T run(); // и метод
    }

    public static void main(String[] args) {
        Helper helper = new Helper(); // создаем экземпляр Runable<T>
        Runner<String> runnerString = new Runner<>();

        runnerString.accept(helper); // передаем в .accept() экземпляр Runable<T>
    }

    static class Helper implements Runable<String> { // создаем класс, чтоб можно было выполнить метод Интерфейса
        @Override
        public String run() {
            return "Hello";
        }
    }

    static class Runner <T> implements Consumer<Runable<T>> { // класс имплементит Consumer значит у него есть метод .accept(T t), в нашем случае accept(Runable<T> tRunable). Чтобы компилятор понял что за тип в Consumer<Runable<T>> класс тоже параметризуется этим типом Runner <T>

        @Override
        public void accept(Runable<T> tRunable) {

        }
    }
}
