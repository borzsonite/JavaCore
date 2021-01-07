package BaseJava.Lesson7.Sandbox.Polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        for (Shape elem: shapes) {
            elem.sayHello();
        }
    }
}
