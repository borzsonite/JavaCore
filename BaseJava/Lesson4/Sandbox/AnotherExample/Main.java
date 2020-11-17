package BaseJava.Lesson4.Sandbox.AnotherExample;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PrivateClass privateObject = new PrivateClass("Значение приватного поля");

        Field privateStringField = PrivateClass.class
                .getDeclaredField("mPrivateString"); // плучаем в privateStringField объект поля mPrivateString

        privateStringField.setAccessible(true); // устанавливаем права доступа

        String fieldValue = (String) privateStringField.get(privateObject);
        System.out.println("значение приватного поля = " + fieldValue);
    }
}
