package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox;

public class  GenericClassAndMethod {
    public static void main(String[] args) {
        Generelized<String> gen = new Generelized<>("Hello");
        System.out.println(gen.getT()); // Hello
        System.out.println(gen.test(10.5)); // 10.5
        System.out.println(gen.test1("Hello again")); //Hello again. Передать в параметры число нельзя
        System.out.println(Generelized.test2("Hello")); //
        System.out.println(gen.test3(1)); //
    }
}

class Generelized <T> {
    T t;

    public Generelized(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public <E> E test(E e) { //обычный метод парметризованный типом отличным от указанного в классе
        return e;
    }

    public T test1(T t) { //обычный метод парметризованный типом идентичным указанному в классе
        return t;
    }

    public static <X> X test2(X x) { //статичный метод парметризованный типом отличным от указанного в классе
        return x;
    }

    public static <T> T test3(T t) { //статичный метод парметризованный типом идентичным указанному в классе
        return t;
    }
}
