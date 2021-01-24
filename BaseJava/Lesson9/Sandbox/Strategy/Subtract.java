package BaseJava.Lesson9.Sandbox.Strategy;

public class Subtract implements Action {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
