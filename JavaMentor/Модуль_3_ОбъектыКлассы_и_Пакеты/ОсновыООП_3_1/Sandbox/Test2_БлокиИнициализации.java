package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.ОсновыООП_3_1.Sandbox;

public class Test2_БлокиИнициализации {
    // пример для изучения блоков инициализации
    private String name;
    private String poroda;
    private int age;

    {
        System.out.println("Это нестатический блок инициализации!");
    }

    public Test2_БлокиИнициализации(String x, String y, int z){
        name = x;
        poroda = y;
        age = z;
    }
    public static void main(String[] args) {
        Test2_БлокиИнициализации d = new Test2_БлокиИнициализации("Шарик", "овчарка", 2);
    }

  static   {
        System.out.println("static blok");
    }
}
