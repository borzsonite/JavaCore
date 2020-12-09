package BaseJava.Lesson6.Sandbox;

public class ComparableExample implements Comparable<ComparableExample> {

    String name;

    public ComparableExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(ComparableExample o) {
        return name.compareTo(o.getName());
    }

    public static void main(String[] args) {
        ComparableExample cpe1 = new ComparableExample("bob");
        ComparableExample cpe2 = new ComparableExample("mike");
        System.out.println(cpe1.compareTo(cpe2));

    }
}
