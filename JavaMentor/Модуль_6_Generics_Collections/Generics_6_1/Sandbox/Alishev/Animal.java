package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Alishev;

public class Animal {
    private int id;

    public Animal() {

    }

    public Animal(int id) {
        this.id = id;
    }

    public void sayHello() {
        System.out.println("Hello from animal");
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
