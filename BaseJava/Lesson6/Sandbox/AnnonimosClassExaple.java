package BaseJava.Lesson6.Sandbox;

//Анонимный класс создается когда нужно реализовать один раз метод интерфейса, чтобы не создавать полноценный класс реализующий метод этого интерфейса

interface AbleToFly {
    void fly();
}

public class AnnonimosClassExaple {

    public static void main(String[] args) {

        AbleToFly jet = new AbleToFly() { // анонимный класс реализующий единственый метод интерфейса
            @Override
            public void fly() {
                System.out.println("I'm jet");
                {
                }
            }
        };

        AbleToFly bird = () -> System.out.println("I'm bird"); // анонимный класс можно заменить лямбдой

        bird.fly();
        jet.fly();
    }
}
