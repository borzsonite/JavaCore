package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Hexlet;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
Если не параметризованный Класс Person наследуется от парамтризованного Human<T1, T2>, то в сигнатуре родителя необходимо указывать конкретные класссы: не extends Human<T1, T2>, a extends Human<String, Integer>

 Если потомок параметризован, то у родителя нужно указывать либо конкретный тип: class Person1<T> extends Human<Integer, String>, либо чтобы типы у потомка и родителя совпадали: class Person1<T> extends Human<T, T>

 Если потомок будет параметризован типом отличным от типов параметризованного родителя, это выглядит так: static class Person2<T1,T2, T3> extends Human<T1,T3>


*/

public class L4_ExtendsFromGeneric {

    public static void main(String[] args) {
        Person person = new Person(1, "Bob", "male");
        System.out.println(person.getSex());

        Person1<String> person1 = new Person1<String>(1, "Jhon", "male");
        System.out.println(person1.getSex());

        Person2<Integer, Long, String> person2 = new Person2<>(1, 1000L, "Bob");
        System.out.println(person2.getName());



    }

    static class Human<T1, T2> {
        private T1 id;
        private T2 name;

        public Human(T1 id, T2 name) {
            this.id = id;
            this.name = name;
        }

        public T1 getId() {
            return id;
        }

        public void setId(T1 id) {
            this.id = id;
        }

        public T2 getName() {
            return name;
        }

        public void setName(T2 name) {
            this.name = name;
        }
    }

    static class Person extends Human<Integer, String> {
        private String sex;

        Person(int id, String name, String sex) {
            super(id, name);
            this.sex = sex;
        }

        public String getSex() {
            return sex;
        }
        public void setSex(String sex) {
            this.sex = sex;
        }
    }

    static class Person1<T> extends Human<Integer, String> {
        private T sex;

        Person1(Integer id, String name, T sex) {
            super(id, name);
            this.sex = sex;
        }

        public T getSex() {
            return sex;
        }

        public void setSex(T sex) {
            this.sex = sex;
        }
    }

    static class Person2<T1,T2, T3> extends Human<T1,T3> {
        private T2 salary;

        Person2(T1 id, T2 salary, T3 sex) {
            super(id, sex);
            this.salary = salary;
        }

        public T2 getSalary() {
            return salary;
        }

        public void setSalary(T2 salary) {
            this.salary = salary;
        }
    }

}


