package BaseJava.Lesson3.Sandbox;

// Смысл шаблонного метода в том, что в абстрактном классе опысывается основная логика, а в наследниках реализуются различия

public class TemplateMethod {
    public static void main(String[] args) {
        C a = new A();
        C b = new B();
        a.print();
        b.print();
    }
}

abstract class C {
    void print() {
        System.out.println(1);
        differ();
        System.out.println(3);
    }

    abstract void differ();
}

class A extends C {
    @Override
    void differ() {
        System.out.println(2);
    }
}

class B extends C {

    @Override
    void differ() {
        System.out.println(4);
    }
}
