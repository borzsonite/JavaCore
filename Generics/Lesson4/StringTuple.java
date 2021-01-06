package Generics.Lesson4;

public class StringTuple extends Tuple<String, String>{
    private final String middle;
    public StringTuple(String left, String middle, String right) {
        super(left, right);
        this.middle = middle;

    }
}
