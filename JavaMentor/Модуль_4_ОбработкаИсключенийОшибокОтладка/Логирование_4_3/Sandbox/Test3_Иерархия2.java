package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3.Sandbox;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Alpha on 14.09.2020.
 */
public class Test3_Иерархия2 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("");
        Logger logger1 = Logger.getLogger("1");
        Logger logger1_2 = Logger.getLogger("1.2");

        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.CONFIG);

        logger1.addHandler(handler);
        //logger1_2.addHandler(new ConsoleHandler());

        logger.info("!msg:!"); // выводится один раз через логер ""
        logger1.config("!msg: 1!"); // выводится 2 раза через логеры 1, ""
        logger1_2.info("!msg: 1.2!"); // выводится 3 раза через логеры 1.2, 1, ""
    }
}
