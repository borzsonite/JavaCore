package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox.ShapesExample;

/**
 * Created by Alpha on 08.09.2020.
 */
public abstract class Shape {
    private Color color;

    public Shape (Color color) {
        this.color = color;
    }

    Color getColor() {
        return this.color;
    }

   // double getArea() { // данный метод лучше сделать абстрактным
      //  return Double.NaN;
   // }
     abstract double getArea(); // делаем метод абстрактным
}

enum Color {
    GREEN,
    RED,
    BLUE;
}


