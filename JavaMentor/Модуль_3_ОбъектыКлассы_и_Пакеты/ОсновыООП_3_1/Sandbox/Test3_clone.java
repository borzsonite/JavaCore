package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.ОсновыООП_3_1.Sandbox;

import java.util.Objects;

public class Test3_clone implements Cloneable{

    String name;
    int id;

    Test3_clone(String name, int id) {
        this.name = name;
        this.id = id;
    }



    public static void main(String[] args) throws CloneNotSupportedException {
        Test3_clone t1 = new Test3_clone("Bob", 1);
        Test3_clone t2 = (Test3_clone) t1.clone();
        System.out.println(t1.equals(t2));
        System.out.println(t2 instanceof Test3_clone);
        System.out.println(t2.name);
        System.out.println( );
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(getClass());
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test3_clone that = (Test3_clone) o;
        return id == that.id &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
