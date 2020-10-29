package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox.Alishev;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alpha on 02.10.2020.
 */

interface MyExecutable {
    int execute(int a);
}

class MyRunner {
    public void run(MyExecutable e) {
        e.execute(10);
    }

}

public class Test2 {
    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
//       runner.run(new MyExecutable() {
//            @Override
//            public void execute(int a) {
//                System.out.println("Hello:");
//            }
//        });

        //   runner.run((x)-> System.out.println("hello" + x));
        runner.run(x -> {
            System.out.println("ha-ha i'm lambda..." + (x * x));
            return x * x;
        });
        // т.е. лямбда знает что метод run принимает объект MyExecutable у которого есть метод принимающий в качестве параметра х (при этом лямбда знает какого типа этот х и прописывать тип не нужно). То что после стрелки это реализация метода из интерфейса, и она может быть любая
    }
}

// Есть метод который в качестве параметра принимает экземпляр анонимного класса реализующего функциональный интерфейс. У этого метода прописана какая-то логика завязаннная на абстрактном методе объявленном в интерфейсе (для того в метод и передаются анонимный класс чтобы на нем вызвать анонимный метод, т.е. по сути от анонимного класса нам нужет только один его метод, имплементирющий абстрактный метод интерфейса). Лямбда по сути реализация анонимного класса в виде его метода. т.е. было
//          new MyExecutable() { эту часть убираем
////            @Override       и эту
////            public void execute(int a) { здесь оставляем только парметры в скобках
////                System.out.println("Hello:"); это часть прописываемая после стрелки
////        }  и остается (int a) -> System.out.println("Hello:") можно сократить a -> System.out.println("Hello:")