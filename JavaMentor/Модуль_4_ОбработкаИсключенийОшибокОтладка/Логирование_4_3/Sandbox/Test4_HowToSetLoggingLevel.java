package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3.Sandbox;

import java.util.logging.*;

public class Test4_HowToSetLoggingLevel {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Test4_HowToSetLoggingLevel.class.getName());

//        logger.setFilter(new Filter() {
//            public boolean isLoggable(LogRecord record) {
//                return false;
//            }
//        });

// Получается что помимо filter'a который может отсекать сообщения передаваемые в логер и далее в хэндлер, существует еще 2уровневая идентификация на уровне логера и хэндлера. Т.е. сначал проверяется, что сообшение проходит через фильтр, затем что оно соответсвует уровню важности заданному в логерре т.е. что logger.setLevel(Level.CONFIG) и сообщение должно быть не ниже CONFIG т.е. logger.config("message") или logger.info("message") etc. Далее проверка идет на уровне хэндлера, чтобы его уровень также был не ниже уровня переданого из логера сообщения handler.setLevel(Level.CONFIG). Фильтр не оказывает действия на передачу сообещения из потомка родителю, т.е. если у потомка стоит фильтр,  который блокирует все сообщения, то этот фильтр не затрагивает сообщения поступающие из нижележащего в иерархии логера.

        Handler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);
        consoleHandler.setLevel(Level.FINE);
        logger.setLevel(Level.FINE);


        logger.config("config done");
    }
}
