package BaseJava.Lesson3.Sandbox;

public class Test5 {
    static String var = "Parent";
    String var2 = "non-static var from Parent";

    public static void main(String[] args) {
        //////////Статические методы. Выбор метода определяется типом ссылки, а не объекта на который она ссылается.
        Test5 test5 = new Test5Child();
        Test5 test5Child = new Test5Child();

        test5.test();// Ссылка родительского типа, значит при вызове через нее метода вызовется, также метод из родительского типа
        test5Child.test();// Ссылка наследуемого типа, значит при вызове метода вызовется, метод из наследуемого класса.


///////////Статические переменные, аналогично с методами вызываемая переменная зависи от типа ссылки на объект черзе которы
        System.out.println(test5.var2); // non-static var from Parent
        System.out.println(test5Child.var2); // non-static var from Child


    }
    static void test() {
        System.out.println("Hello from parent");
    }
}

class Test5Child extends Test5 {
    static String var = "Child";
    String var2 = "non-static var from Child";


    static void test() {
        System.out.println("Hello from child");
    }
    }


