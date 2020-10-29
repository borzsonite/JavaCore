package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Пакеты_и_МодификаторыДоступа_3_2.Sandbox;

public class Test1 {

   static class Vehicle{
        public static void  kmToMiles(int km){
            System.out.println("Внутри родительского класса/статического метода");
        } }

    static class Car extends Vehicle{
        public static void  kmToMiles(int km){
            System.out.println("Внутри дочернего класса/статического метода ");
        }
        void drive() {
            System.out.printf("Go");
        }
   }

    static public class Demo{
        public static void main(String args[]){
            Vehicle v = new Car();
            v.kmToMiles(10);

        }}
}
