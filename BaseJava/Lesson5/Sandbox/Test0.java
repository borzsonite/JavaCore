package BaseJava.Lesson5.Sandbox;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;

public abstract class Test0 {
    private static String myName = "Hi";
    private String ParentName;
    protected static final int STORAGE_LIMIT = 11;

    String getName() {
        return myName;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Child child = new Child();
        Class clazz = child.getClass();
        Field field = child.getClass().getSuperclass().getDeclaredField("myName");
        field.setAccessible(true);
        System.out.println(child.getName());
        field.set(child, "Hello");
        System.out.println(child.getName());

    }
}

class Child extends Test0 {
    public String myName;

}
