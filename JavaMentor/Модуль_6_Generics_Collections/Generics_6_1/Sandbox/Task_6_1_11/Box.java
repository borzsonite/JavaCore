package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Task_6_1_11;

/**
 В классе Box из прошлой задачи нужно добавить статический метод getBox(), который возвращает пустой параметризованный объект типа Box,

 Требования:
 1. Класс должен быть параметризован T.
 2. Поле должно быть приватным с именем object.
 3. Класс должен иметь публичный модификатор доступа.
 4. Класс должен иметь публичный статический метод getBox().
 4. метод getBox() должен работать согласно условию.
 5. Класс Box должен быть статическим.
 */

public class Box<T> {
    private T object;

    public Box(T object) {
        this.object = object;
    }

    public Box() {

    }

    public static void main(String[] args) {
        Box<String> box = new Box<String>("Hello from box");
        System.out.println(box.getBox());
    }

    public static <T> Box <T> getBox() {
        return new Box<>();
    }
}
