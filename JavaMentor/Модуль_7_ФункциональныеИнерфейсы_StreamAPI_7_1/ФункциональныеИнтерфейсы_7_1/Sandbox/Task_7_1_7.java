package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

import java.util.function.UnaryOperator;

/*
Напишите метод с названием sqrt, который возвращает реализацию функционального интерфейса UnaryOperator, который принимает целое число(тип int) и возвращает его квадрат.
**/

public class Task_7_1_7 {
        public UnaryOperator<Integer> sqrt() {
            return x -> x * x;
        }

}
