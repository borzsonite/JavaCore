package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Alishev;

public class Dog extends Animal {
    public Dog(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "A dog";
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from dog");
    }
}
