package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Task_6_1_13;

import java.util.*;

/**
 * Массивы в Java имеют фиксированную длину. Попробуем обойти это ограничение. Создайте класс DynamicArray, который хранит в себе массив, и имеет методы для добавления void add(T el), void remove(int index) удаления и извлечения T get(int index) из него элементов, при переполнении текущего массива, должен создаваться новый, большего размера.
 * <p>
 * Для возможности работы с различными классами DynamicArray должен быть дженериком. Для решения задачи можно воспользоваться методами из класса java.util.Arrays. Импорт этого класса уже объявлен в тестирующей системе. Добавлять его явно не нужно
 * <p>
 * Требования:
 * 1. должен быть класс public static class DynamicArray
 * 2. класс DynamicArray должен иметь методы публичные void add(T el), void remove(int index) и T get(int index)
 * 3. класс DynamicArray должен  иметь публичный конструктор по умолчанию
 * 3. работа методов должна соответствовать условию
 */

public class Main {

    public static class DynamicArray<T> {
        Object[] elem;
        int size = 0;

        public DynamicArray() {
            elem = new Object[5];
        }

        void add(T el) {
            if ((elem.length - size) < 1) {
                elem = Arrays.copyOf(elem, size + 5);
            }
            elem[size++] = el;
        }

        void remove(int index) {
            final int newSize;
            if ((newSize = size - 1) > index)
                System.arraycopy(elem, index + 1, elem, index, newSize - index);
            elem[size = newSize] = null;
        }

        T get(int index) {
            return (T) elem[index];
        }
    }

    static class Test {
        public static void main(String[] args) {
            List list = new ArrayList<>();
            DynamicArray<String> da = new DynamicArray<>();
            DynamicArray<Integer> da1 = new DynamicArray<>();
            da.add("a");
            da.add("b");
            da.add("c");
            da.add("d");
            da.remove(2);

            da1.add(1);
            da1.add(2);
            da1.add(3);
            da1.add(4);
            da1.add(5);
            da1.add(6);
            da1.add(7);
            da1.add(8);
            da1.add(9);
            da1.add(10);
            da1.add(11);
            da1.remove(4);

            for (int i = 0; i < da1.size; i++) {
                System.out.println(da1.get(i));
            }
        }
    }
}


