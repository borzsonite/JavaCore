package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox;

public class Test1 {
    public static void main(String[] args) {
        Box box = new Box("My Box");
        System.out.println(box.get());;
        box.set(1);
        System.out.println(box.get());;
    }
}

class Box <T>{
    private T t;

    Box(T t) {
        this.t = t;
    }

    public void set(T t) {
        this.t = t;
    }

    protected T get() {
        return t;
    }
}
