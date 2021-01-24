package BaseJava.Lesson9.Sandbox.Strategy;

public class Divide implements Action{
    @Override
    public int calculate(int a, int b) {
        return a/b;
    }
}
