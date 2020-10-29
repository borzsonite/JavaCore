package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Task_6_1_12;

import java.util.Optional;

/**
 * Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.
 * Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of(). Конструктор должен быть закрытым (private).
 */

public class Pair<T, E> {
    private T t;
    private E e;

    private Pair(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public T getFirst() {
        return t;
    }

    public E getSecond() {
        return e;
    }

    public static <T, E> Pair<T, E> of(T val1, E val2) {
        return new Pair<>(val1, val2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (t != null ? !t.equals(pair.t) : pair.t != null) return false;
        return e != null ? e.equals(pair.e) : pair.e == null;
    }

    @Override
    public int hashCode() {
        int result = t != null ? t.hashCode() : 0;
        result = 31 * result + (e != null ? e.hashCode() : 0);
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        System.out.println(i);
        System.out.println(s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }
}
