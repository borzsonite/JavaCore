package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox.ShapesExample;

/**
 * Created by Alpha on 08.09.2020.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getXY() {
        return "x=" + x + ",y=" + y;
    }
}
