package BaseJava.Lesson8.Sandbox;

/**
 Полями класса могут служить коллекции. Чтобы их инициализировать в конструкторе, можно в качкестве параметра указать вараргс. Например есть поле  List<Integer> index, вместо конструктора

 public ArrayToListInConstructorEx(List<Integer> index) {
 this.index = index;
 }
  пишем:
 public ArrayToListInConstructorEx(Integer... index) {
 this.index = Arrays.asList(index);
 }

 тогда не нужно будте сначала создавать лист интеджеров, а потом записывать в поле index, можно будет при создании экземппляра класса сразу передать в конструктор необходимые параметры, которые через  this.index = Arrays.asList(index) будут преобразованы в лист и записны в index

 */


import java.util.Arrays;
import java.util.List;

public class ArrayToListInConstructorEx {
    private List<Integer> index;
    private List<Test> testIndex;

    public ArrayToListInConstructorEx(Integer... index) { // Integer... index вместо List<Integer> index
        this.index = Arrays.asList(index);
    }

    public ArrayToListInConstructorEx(Test... testIndex) {
        this.testIndex = Arrays.asList(testIndex);
    }

    public List<Integer> getIndex() {
        return index;
    }

    public int getFromIndex(int index) {
        return this.index.get(index);
    }

    public int getIdFromTestList(int id) {
        return testIndex.get(id).getId();
    }
}

class Main {
    public static void main(String[] args) {
        ArrayToListInConstructorEx ex = new ArrayToListInConstructorEx(1, 2, 3); // вместо того чтобы сначала создавать лист и потом передавать его в конструктор, сразу указываем значения, которые запишутся в лист и далее в поле index
        System.out.println(ex.getIndex());
        System.out.println(ex.getFromIndex(0));

        ArrayToListInConstructorEx exList =
                new ArrayToListInConstructorEx(
                        new Test(1),
                        new Test(2),
                        new Test(3));

        System.out.println(exList.getIdFromTestList(1));
    }
}

class Test {
    int id;

    public Test(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
