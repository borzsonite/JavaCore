package Generics.Lesson1;

public class Tuple<T> { // создаем типизированный класс в котором может использоваться класс Т (вместо Т любой тип)
    private T left;
    private T right;

    public Tuple(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
}

class Main {
    public static void main(String[] args) {
        Tuple<String> tuple = new Tuple<>("left", "right"); // здесь при создании объекта вместо Т подставляется тип String
        System.out.println(tuple.getLeft());
        System.out.println(tuple.getRight());

        Tuple<SuperClass> tsuper = new Tuple<>(new SuperClass(), new SuperClass()); // здесь вместо Т используется собственный класс SuperClass
        System.out.println(tsuper.getLeft());
    }
}

class SuperClass {
    @Override
    public String toString() {
        return "SuperClass{}";
    }
}
