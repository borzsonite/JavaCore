package VTB.lesson1.Sandbox;

public class Animal {
    private int a;
    protected int z;

    public Animal(int a) {
        this.a = a;
    }
}

class Cat extends Animal {
    private int b;
    protected int z;

    public Cat(int a, int b) {
        super(a);         // Вызываем конструктор Animal
        this.b = b;
    }

    public void test() {
        z = 10;           // Обращение к полю z класса Cat
        super.z = 20;     // Обращение к полю z класса Animal
    }
}

class BombeyCat extends Cat {
    private int c;

    public BombeyCat(int a, int b, int c) {
        super(a, b);     // Вызываем конструктор Cat
        this.c = c;
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Cat cat = new Cat(2,3);
        cat.test();
        BombeyCat bombeyCat = new BombeyCat(4,5,6);
    }
}
