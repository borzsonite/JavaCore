package BaseJava.Lesson3.Sandbox;

import java.util.Arrays;

interface Vehicle {
    void go();
}

class Automobile implements Vehicle {
    public void go() {
        System.out.println("Automobile go!");
    }
}
class Truck implements Vehicle {
    public Truck(int i) {
        super();
    }
    public void go() {
        System.out.println("Truck go!");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Vehicle vehicle;
        String[] vehicleNames = {"BaseJava.Lesson3.Sandbox.Automobile",
                "BaseJava.Lesson3.Sandbox.Truck", "BaseJava.Lesson3.Sandbox.Tank"};
        for(int i=0; i<vehicleNames.length; i++) {
            try {
                String name = vehicleNames[i];
                System.out.println("look for class for: " + name);
                Class aClass = Class.forName(name); //Получить экземпляр Class для конкретного класса можно с помощью метода .forName()
                System.out.println("creating vehicle...");
                vehicle = (Vehicle)aClass.newInstance(); //создает и возвращает объект класса, который представляется данным экземпляром Class
                System.out.println("create vehicle: " + vehicle.getClass());
                vehicle.go();
            } catch(ClassNotFoundException e) {
                System.out.println("Exception: " + e);
            } catch(InstantiationException | IllegalAccessException e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}
