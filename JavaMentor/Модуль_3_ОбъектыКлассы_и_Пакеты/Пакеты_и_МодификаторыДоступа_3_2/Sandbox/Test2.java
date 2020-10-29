package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Пакеты_и_МодификаторыДоступа_3_2.Sandbox;

public class Test2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.id = 1;
        System.out.println(car.id);
        System.out.println(Car.id);
        System.out.println(car2.id);
    }

}

 class Car {
    static int id;
}
