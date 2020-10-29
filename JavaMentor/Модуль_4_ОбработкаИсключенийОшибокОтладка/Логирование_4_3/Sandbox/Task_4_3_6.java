package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3.Sandbox;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 Создайте в статичном публичном методе logging логгер с именем com.javamentor.logging.Test, залогируйте им два сообщения: первое "Все хорошо" с уровнем INFO и второе "Произошла ошибка" с уровнем WARNING.

 java.util.logging.* импортирован за вас
 */
public class Task_4_3_6 {

    public static void main(String[] args) {
        logging();
    }

    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.setLevel(Level.CONFIG);


        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.CONFIG);
        logger.addHandler(handler);

        logger.log(Level.INFO, "Все хорошо");
        logger.log(Level.WARNING, "Произошла ошибка");
        logger.log(Level.CONFIG, "Config done!");

//        logger.addHandler(new ConsoleHandler().setLevel(Level.CONFIG));


    }

}
