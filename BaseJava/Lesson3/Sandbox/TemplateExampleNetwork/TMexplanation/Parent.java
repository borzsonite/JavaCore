package BaseJava.Lesson3.Sandbox.TemplateExampleNetwork.TMexplanation;

public abstract class Parent {

    abstract void calcPlus(int a, int b);
    abstract void calcMinus(int a, int b);

    protected void calculate() {
        calcPlus(2, 3); // Обращаешься к абстрактным методам родительского класса, но реализация их будет переопределена в наследниках
        calcMinus(5, 1);
    }
}

class Child extends Parent {

    public static void main(String[] args) {
        Child child = new Child();
        child.calculate();
    }

    @Override
    void calcPlus(int a, int b) { // конкретная реализация метода родительского классс
        System.out.println(a + b);
    }

    @Override
    void calcMinus(int a, int b) {
        System.out.println(a - b);
    }
}
