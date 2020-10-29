package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox.ShapesExample;

/**
 * Created by Alpha on 08.09.2020.
 */
public class Main {
    public static void main(String[] args) {
        Square square = new Square(Color.RED, new Point(1,5), 10.0);
        Circle circle = new Circle(Color.BLUE, new Point(10, 3), 5);

        System.out.println(square);
        System.out.println(circle);

        Shape[] shapes =  new Shape[]{square, circle};
        for(Shape shape: shapes) {
            System.out.println(shape.getArea());
        }
    }
}
