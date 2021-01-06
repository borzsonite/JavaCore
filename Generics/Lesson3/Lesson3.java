package Generics.Lesson3;

//Параметризация несколькими типами
public class Lesson3<T1, T2> {
    private final T1 left;
    private final T2 right;

    public Lesson3(T1 left, T2 right) {
        this.left = left;
        this.right = right;
    }

    public T1 getLeft() {
        return left;
    }

    public T2 getRight() {
        return right;
    }
}

class Main {
    public static void main(String[] args) {
        Lesson3<Integer, String> lesson3 = new Lesson3<>(3, "Hello");
        System.out.println(lesson3.getLeft());
        System.out.println(lesson3.getRight());
    }
}