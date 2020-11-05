package BaseJava.Lesson2.Sandbox;
/**
 Можно ли расширить или сузить метод у наследника?
 */

public class Test4 {
    private void execute() {
        System.out.println("hello");
    }
}

class Test4Child extends Test4 {
    private void execute() {
        System.out.println("hello");
    }
}
