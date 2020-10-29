package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox;

/**
 * Created by Alpha on 15.09.2020.
 */
public class Test3 {



    class   Shape {

        String shape;

        Shape returnShape(Shape shape) {
            return shape;
        }
    }

    class Triangle extends Shape {
        Shape returnShape(Triangle triangle) {
            return triangle;
        }
    }

}
