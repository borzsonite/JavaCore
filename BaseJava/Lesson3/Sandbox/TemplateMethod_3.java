package BaseJava.Lesson3.Sandbox;

import org.w3c.dom.ls.LSOutput;

public class TemplateMethod_3 {
    public static void main(String[] args) {
        School school = new School();
        University university = new University();
        school.learn();
        university.learn();
    }

}

abstract class Study {
     void learn() {
        enter();
        study();
        passExam();
        getDocument();
    }

    abstract void enter();
    abstract void study();
    abstract void passExam();
    abstract void getDocument();

    abstract void seleprate();
}

class School extends Study {

    @Override
    void enter() {
        System.out.println("Идем в первый класс");
    }

    @Override
    void study() {
        System.out.println("Посещаем уроки, делаем домашние задания");
    }

    @Override
    void passExam() {}

    @Override
    void getDocument() {
        System.out.println("Получаем аттестат о среднем образовании");
    }

    @Override
    void seleprate() {
        System.out.println("Drink limonade");
    }
}

class University extends Study {

    @Override
    void enter() {
        System.out.println("Сдаем вступительные экзамены и поступаем в ВУЗ");
    }

    @Override
    void study() {
        System.out.println("Посещаем лекции, проходим практику");
    }

    @Override
    void passExam() {
        System.out.println("Сдаем экзамен по специальности");
    }

    @Override
    void getDocument() {
        System.out.println("Получаем диплом о высшем образовании");
    }

    @Override
    void seleprate() {
        System.out.println("Drink Champaign");
    }
}
