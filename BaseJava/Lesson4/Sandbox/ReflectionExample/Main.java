package BaseJava.Lesson4.Sandbox.ReflectionExample;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ReflectionChecker reflectionChecker = new ReflectionChecker();
        Rabbit rabbit = new Rabbit();
        reflectionChecker.showClassName(rabbit);
        reflectionChecker.showClassFields(rabbit);
        reflectionChecker.showClassMethod(rabbit);
        reflectionChecker.showFieldsAnnotations(rabbit);
        reflectionChecker.fillPrivateFields(rabbit);
        Object clone = reflectionChecker.createNewObject(rabbit);
        System.out.println("Clone object is: " + clone.getClass().getName());
        reflectionChecker.showModifiers(rabbit);

        System.out.println(rabbit.getName());
        System.out.println(rabbit.getAge());
    }
}
