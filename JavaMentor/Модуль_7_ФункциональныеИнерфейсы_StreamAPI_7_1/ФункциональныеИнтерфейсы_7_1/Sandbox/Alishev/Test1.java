package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Alishev;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) { // У класс есть метод принимающий экземпляр класса реализующего интерфейс Executable
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

class ExecutableImplemitation implements Executable {
    @Override
    public int execute(int x, int y) {
        System.out.println("Hello1");
        return 1;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        //для вызова метода run и передачи ему аргумента (Executable e) есть три способа:
        // 1. Создать объект класса имплементирующего Executable i.e. ExecutableImplemitation
        runner.run(new ExecutableImplemitation());

        // 2. Реализовать на месте создав анонимный класс
        runner.run(new Executable() { // анонимный класс можно заменить на лямбду т.к. в интерфейсе Executable всего один метод
            @Override
            public int execute(int x, int y) {
                System.out.println("Hello2");
                return x + 2;
            }
        });

        int a = 1;

        // 3. c помощью лямбда выражения
        runner.run((x, y) -> {
            // int a = 4; // так нельзя потому что у лямбды общая область видимости с тем где она была создана
            return x + y + a; // а видна в лямбде
        });
        ;
    }
}

