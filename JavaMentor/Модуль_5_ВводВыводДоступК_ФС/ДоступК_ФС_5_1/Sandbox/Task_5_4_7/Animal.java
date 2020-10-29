package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox.Task_5_4_7;

import java.io.Serializable;

/**
 * Created by Alpha on 22.09.2020.
 */
public class Animal implements Serializable{
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Animal) {
//            return Objects.equals(name, ((Animal) obj).name);
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Animal:" + name;
    }
}
