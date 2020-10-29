package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3.Sandbox;

import java.util.logging.Logger;

public class Test2_ИерархияЛоггеров {
    public static void main(String[] args) {

        Logger logger3  = Logger.getLogger("");
        Logger logger2 = Logger.getLogger("com");
        Logger logger1 = Logger.getLogger("com.jenkov");
        Logger logger = Logger.getLogger("com.jenkov.web");

        Logger logger4 = Logger.getLogger(Test2_ИерархияЛоггеров.class.getName());
        Logger logger5 = Logger.getLogger("JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3.Sandbox");
        Logger logger6 = Logger.getLogger("JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3");

        // Если закоментить строку 14 (logger5 creation), то родителем логера4 станет логер6


        System.out.println(logger.getParent().getName()); // com.jenkov
        System.out.println(logger1.getParent().getName()); // com

        System.out.println(logger4.getName()); // JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3.Sandbox.Test2_ИерархияЛоггеров
        System.out.println(logger4.getParent().getName()); // logger5 родитель logger4 вывод: JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3.Sandbox
        System.out.println(logger5.getParent().getName()); // logger6 родитель logger5 вывод: JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3
    }

}
