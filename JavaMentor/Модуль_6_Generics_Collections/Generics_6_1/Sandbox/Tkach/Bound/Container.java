package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Tkach.Bound;

public class Container <T extends Product & Comparable<T>>{
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
