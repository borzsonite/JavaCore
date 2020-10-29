package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.ОсновыООП_3_1.Sandbox;

public class Test3 {
    private int id;
    static private int id2;


    public  Test3() {
        id = 3;
    }
    public static void main(String[] args) {
       // id = 3;
        id2 = 3;
    }

    void getid2() {
        id = 4;
        id2 = 5;
    }
}

// Из нестатиченого метода доступны и статичные и нестатичные переменные, из статичного метода только статичные.