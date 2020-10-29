package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox.ShapesExample;

/**
 * Created by Alpha on 08.09.2020.
 */
public class Square extends Shape {
    private Point point;
    private double side;

    public Square(Color color, Point point, double side) {
        super(color);
        this.point = point;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Shape is Square" + '\n'+
                "сторона:" + this.side + '\n'+
                "цвет:" + this.getColor()+ '\n'+
                "точка:" + this.point.getXY() + '\n';
    }

    @Override
    double getArea() {
        return side * side;
    }
}
