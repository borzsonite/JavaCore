package BaseJava.Lesson3.Sandbox;

import java.awt.*;

public class Test4 {
    public static void main(String[] args) {
        Child1 c = new Child1();
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

class Child1 extends Parent {
    static public void getValue() {
        System.out.println("child");
    }
}
