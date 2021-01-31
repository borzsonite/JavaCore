package BaseJava.Lesson9.Sandbox.Strategy;

public class Sleep implements Activity {
    @Override
    public void activity() {
        System.out.println("I'm sleeping");
    }
}
