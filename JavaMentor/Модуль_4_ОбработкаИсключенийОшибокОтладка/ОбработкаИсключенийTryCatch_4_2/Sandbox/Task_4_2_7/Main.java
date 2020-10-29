package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.ОбработкаИсключенийTryCatch_4_2.Sandbox.Task_4_2_7;

public class Main {
   public static class Car implements AutoCloseable {

       static void drive() {
            System.out.println("Машина поехала.");
        }

        @Override
        public void close() throws Exception {
            System.out.println("Машина закрывается...");
        }
    }

    public static void main(String... args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception e) {

        }
    }
}
