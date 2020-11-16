package BaseJava.Lesson4.Sandbox.ReflectionExample;

public class Main {
    public static void main(String[] args) {
        ReflectionChecker reflectionChecker = new ReflectionChecker();
        Rabbit rabbit = new Rabbit();
        reflectionChecker.showClassName(rabbit);
        reflectionChecker.showClassFields(rabbit);
        reflectionChecker.showClassMethod(rabbit);
        reflectionChecker.showFieldsAnnotations(rabbit);

        System.out.println(rabbit.getName());
        System.out.println(rabbit.getAge());
    }
}
