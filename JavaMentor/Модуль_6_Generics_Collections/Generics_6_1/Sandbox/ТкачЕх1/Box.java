package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.ТкачЕх1;

public class Box <T extends Number> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public <T, E> String process(T item, E param) {
        return "res";
    }

    public Number sum(Box <?extends Number> val1, Box <?extends Number> val2 ) {
        //return val1.getItem() + val2.getItem();
        return null;
    }
}
