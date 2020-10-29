package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.video2;

// создать параметризованный класс и вызвать у него парметризованый метод

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Class1<String> class1 = new Class1<>();
        class1.printT("Hello1");
        // class1.printT(1); так не работает т.к Class1<String> и в метод printT(String t) нельзя передать int

        Class2 class2 = new Class2();
        class2.printT("Hello2");
        class2.printT(2);

        Class3 class3 = new Class3();
        class3.printT(1); // Class3<T extends Number> поэтому в метод можно передать только Number и наследников

        Class4 class4 = new Class4();
        class4.print(new A()); // вызывается метод из class4 в котором на объекте class A вызывается метод printA

        Class5<Integer> class5 = new Class5<>();
        class5.print("Hello", 1);

        //////////////////ОГРАНИЧЕНИЯ///////////////////
        List<Number> nums;
        List<Integer> ints = new ArrayList<>();
       // ints = nums;


    }
}

class Class1<T> {
    void printT(T t) {
        System.out.println(t);
    }
}

class Class2 {
    <T> void printT(T t) {
        System.out.println(t);
    }
}

class Class3<T extends Number> {
    public void printT(T t) {
        System.out.println(t);
    }
}

class Class4<T extends A & Interface> { // параметризуется наследниками класса А и Intreface???
    void print(A a) {
        a.printA();
    }

}

class Class5<T> { // одновременно можно парметризовать и класс <T>
    public <E> void print(E e, T t) {  // и метод <E>. Дженерик указывается перед возвращаемым значением
        System.out.println("e=" + e + " t=" + t);
    }
}


interface Interface {
    void printA();
}

class A implements Interface {
    @Override
    public void printA() {
        System.out.println("Hello from class A");
    }
}

