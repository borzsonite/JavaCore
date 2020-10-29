package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox.ShapesExample;


/**
 * Created by Alpha on 08.09.2020.
 */
public class Circle extends Shape {

    private Point point;
    private double radius;

    public Circle(Color color, Point point, double radius) {
        super(color);
        this.point = point;
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Shape is Circle" + '\n' +
               "Radius:" + radius + '\n' +
               "Color:" + this.getColor()+ '\n';
    }
}
