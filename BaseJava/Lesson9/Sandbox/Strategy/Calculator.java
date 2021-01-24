package BaseJava.Lesson9.Sandbox.Strategy;

public class Calculator {
    private Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void doAction(int a, int b) {
        System.out.println(action.calculate(a, b));
    }
}

class CalculatorExecutor {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setAction(new Subtract());
        calculator.doAction(8, 2);
    }
}
