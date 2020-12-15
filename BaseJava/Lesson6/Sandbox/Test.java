package BaseJava.Lesson6.Sandbox;

public class Test {

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.sayHello();
    }

//    Test2 test2 = new Test2();
//        test2.sayHello();

    {
        Test2 test2 = new Test2();
        test2.sayHello();
    }
}

class Test2 {
    void sayHello() {
        System.out.println("Hello");
    }
}