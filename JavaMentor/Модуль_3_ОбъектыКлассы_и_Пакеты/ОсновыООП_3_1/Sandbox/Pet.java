package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.ОсновыООП_3_1.Sandbox;


public class Pet {
    private String name;

    static {
        System.out.println("Static block in Pet"); //1
    }

    {
        System.out.println("First block in Pet"); //3
    }

    {
        System.out.println("Second block in Pet"); //4
    }

    public Pet() {
        System.out.println("Pet empty constructor");
    }

    public Pet(String name) {
        System.out.println("Pet constructor with Name " + name); //5
        this.name = name;
    }
}

class Cat extends Pet {

    private String name;

    static {
        System.out.println("Static block in Cat"); //2
    }

    {
        System.out.println("First block in Cat"); //6
    }

    {
        System.out.println("Second block in Cat"); //7
    }

    public Cat() {
        System.out.println("Cat empty constructor");
    }

    public Cat(String name) {
        //super(name); // without this will call super(). Если эту строчку убрать, то будет вызван конструктор Pet();
        System.out.println("Cat constructor with Name: " + name); //8
        this.name = name;
    }

}

class TestInitOrder {

    public static void main(String[] args) {
        Cat cat = new Cat("Rizhick");
    }
}

//Выво
/***
 Static block in Pet
 Static block in Cat
 First block in Pet
 Second block in Pet
 Pet constructor with Name Rizhick
 First block in Cat
 Second block in Cat
 Cat constructor with Name: Rizhick
 }
 */