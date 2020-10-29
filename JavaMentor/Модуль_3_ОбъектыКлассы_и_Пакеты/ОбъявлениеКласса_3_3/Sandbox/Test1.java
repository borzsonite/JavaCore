package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.ОбъявлениеКласса_3_3.Sandbox;

public class Test1 {
    int var1;
    int var2;
    int var3;
    int var4;


    public Test1(int var1) {
        this.var1 = var1;
    }

    public Test1(int var1, int var2) {
        this(var1, var2, 0);
    }

    public Test1(int var1, int var2, int var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = 10;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1(2,5);
        System.out.println(t1.var1);
        System.out.println(t1.var2);
        System.out.println(t1.var3);
        System.out.println(t1.var4);
    }

}
