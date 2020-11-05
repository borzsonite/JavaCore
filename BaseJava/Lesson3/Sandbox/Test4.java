package BaseJava.Lesson3.Sandbox;

import java.awt.*;

public class Test4 {
    public static void main(String[] args) {
        Child c = new Child();
        c.getValue();
        Parent p = c;
        p.getValue();
    }
}

class Parent {
    static public void getValue() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    static public void getValue() {
        System.out.println("child");
    }
}
