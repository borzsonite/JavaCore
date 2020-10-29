package JavaMentor.Модуль_4_ОбработкаИсключенийОшибокОтладка.Логирование_4_3.Sandbox;

import java.util.logging.*;

public class Test1 {

    int id;

    Test1(int id) {
        this.id = id;
    }

    private static final Logger logger = Logger.getLogger(Test1.class.getName());



    public static void main(String[] args) {
        Test1 t1 = new Test1(1);
        t1.doIt();
    }

    public void doIt() {
        logger.entering(getClass().getName(), "doIt");


        try {
            //... something that can throw an exception
            throw new Exception("My Exception!");
        } catch (Exception e) {
            logger.log(Level.CONFIG, "Error doing XYZ", e);
        }

        logger.exiting(getClass().getName(), "doIt");
    }


}
