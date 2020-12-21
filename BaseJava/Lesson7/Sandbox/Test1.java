package BaseJava.Lesson7.Sandbox;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // Проблема была следующей. При использовари сырых типов и помещеии в коллекцию нескольких объектов, дальнейшее привеедние типов могло вызвать ClassCastExсeption

        List list = new ArrayList();
        list.add(5);
        list.add("Hello");

        for (Object i : list) {
            System.out.println((String) i); //RunTimeError
        }

        // Во избежании этого стали использовать деженирики
        List<Integer> list2 = new ArrayList<>();
    }
}

// пример создания параметризованного класса
class GenericClass<T extends Comparable<T>> implements Comparable<GenericClass<T>> {
    T field;

//    public GenericClass(T field) {
//        this.field = field;
//    }

    void setField(T field) {
        this.field = field;
    }

    T getField() {
        return field;
    }

    // пример параметризованного метода. Обобщенный параметр указывается посли модификатора и перед возвращаемым значением
    public static <R> boolean isEqual(R o1, R o2) {
        return o1.equals(o2);
    }

    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<>(); // параметризуем класс Integer
        genericClass.setField(5);

        GenericClass<String> genericClass1 = new GenericClass<>(); // параметризуем класс String
        genericClass1.setField("Hello");

        System.out.println(genericClass.getField());
        System.out.println(genericClass1.getField());

        GenericClass<String> genericClass2 = new GenericClass<>();
        GenericClass<String> genericClass3 = new GenericClass<>();
        genericClass2.setField("hello");
        genericClass3.setField("hello");
        System.out.println(GenericClass.isEqual(genericClass2, genericClass3));
    }

    @Override
    public int compareTo(GenericClass<T> o) {
        if (this.getField().equals(o.getField())) {
            return 0;
        } else {
            return -1;
        }
    }
}

