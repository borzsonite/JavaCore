package BaseJava.Lesson3.Sandbox;

public class Test3 {

    static class Parent {
        String a = "parent";
        public int getValue() {
            return 0;
        }
        public void print() {
            System.out.println(getValue());
        }

        static public  int getName() {
            System.out.println("parent method");
            return 7;
        }
    }
    static class Child extends Parent {
        String a = "child";
        public int getValue() {
            return 1;
        }

        static public  int getName() {
            System.out.println("child method");
            return 4;
        }
    }

    public static void main(String[] args) {
        // при наличии двух одинаковых методов в родителе и потомке, то какой метод будет вызван определяется НЕ типом ссылки, а тем на какой объект она ссылается. Даже если ссылка типа Parent, но ссылается на потомка, то будет вызван метод потомка
        Child c = new Child();
        System.out.println(c.getValue()); //1. Переменная ссылается на потомка, следовательно вызвается метод из потомка
        Parent p = new Child(); // метод родителя перекрыт
        System.out.println(p.getValue());//1. Переменная ссылается на потомка, следовательно вызвается метод из потомка
        Parent с = new Child();
        c.print(); //1. Здесь тоже, хотя .print() есть только в родителе, из-за того что переменная с ссылается на потомка метод get вызывается у потомка.

        //при наличии двух одинаковых СТАТИЧЕСКИХ методов в родителе и потомке, то какой метод будет вызван определяется ТИПОМ ссылки, а НЕ тем на какой объект она ссылается. Если ссылка типа Parent, но ссылается на потомка, все равно будет вызван метод РОДИТЕЛЯ
        Parent parent = new Child();




        // при наличии одинаковых переменных в родителе и потомке, то какая переменая будет вызвана определяется типом ссылки
        Parent d = new Child(); // сылка имеет тип Parent значит обращение будет к переменной из родителя.
        System.out.println(d.a); // 2


    }
}
