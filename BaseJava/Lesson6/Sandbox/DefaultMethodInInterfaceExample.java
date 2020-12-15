package BaseJava.Lesson6.Sandbox;

interface Formula {
    int sum(int a, int b);

    default double sqrt(double num) {
        return Math.sqrt(num);
    }
}

class Calculator implements Formula {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

public class DefaultMethodInInterfaceExample {

    public static void main(String[] args) {
        Formula formula = new Calculator();
        System.out.println(formula.sum(3, 2));
        System.out.println(formula.sqrt(9.0));

        Formula formula1 = new Formula() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        formula1.sqrt(16);
        formula1.sum(3, 4);

        Formula formula22 = (a, b) -> a + b; // лямбда
        Formula formula23 = Integer::sum; // ссылка на метод
        System.out.println(formula23.sum(5,5));

    }

}
