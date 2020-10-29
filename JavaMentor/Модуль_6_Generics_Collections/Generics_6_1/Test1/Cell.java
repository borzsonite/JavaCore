package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Test1;

//Параметризованный класс

public class Cell<T> { //Класс может работать с любым типом
    T item;

    public Cell(T item) {
        this.item = item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Test {
    public static void main(String[] args) {
        Cell<String> cell = new Cell<>("first item");
        Cell<Integer> cell1 = new Cell<>(1);
        System.out.println(cell.getItem());
        System.out.println(cell1.getItem());
    }

}
