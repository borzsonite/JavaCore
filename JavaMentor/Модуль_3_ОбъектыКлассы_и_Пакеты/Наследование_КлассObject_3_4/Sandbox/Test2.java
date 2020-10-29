package JavaMentor.Модуль_3_ОбъектыКлассы_и_Пакеты.Наследование_КлассObject_3_4.Sandbox;



public class Test2 {

    public static void main(String[] args) {
        Human human = new Human(0);
        Student student = new Student(1);
        human = student; // human более широкий тип и вмещает в себя в т.ч. студента
        student = (Student) human; // студент более узкий тип, не все люди студенты

        Human st1 = new Student(2);
        st1.sayHuman(); // для st1 доступны только методы суперкласса (Human)

        Student st2 = new Student(3);
        st2.sayHuman(); // доступны методы суперкласса
        st2.sayStudent(); //доступны методы наследника

        Student st3 = (Student) new Human(4); // необходимо явное приведение т.к. Student более узкий тип.
        st3.sayHuman();
        st3.sayStudent();


    }
}

class Human {
    private int id;

    public Human(int id) {
        this.id = id;
    }

    public void sayHuman() {
        System.out.println("human");
    }
}

class Student extends Human {
    public Student(int id) {
        super(id);
    }

    public void sayStudent() {
        System.out.println("student");
    }
}