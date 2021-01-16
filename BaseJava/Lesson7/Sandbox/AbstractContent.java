package BaseJava.Lesson7.Sandbox;

// Народ, подскажите, нужно в методе showContent организовать вывод либо строки, либо элементов List<String> или LIst<Integer>. Как можно это организовать?? toString() не предлагать)

import java.util.Arrays;
import java.util.List;

public abstract class AbstractContent<T> {
    T content;

    abstract T getContent();
}

//class StringContent extends AbstractContent<String> {
//    String content;
//
//    public StringContent(String content) {
//        this.content = content;
//    }
//
//    @Override
//    String getContent() {
//        return content;
//    }
//}

class StringListContent extends AbstractContent<List<String>> {
    List<String> content;

    public StringListContent(List<String> content) {
        this.content = content;
    }

    @Override
    List<String> getContent() {
        return content;
    }
}

class IntegerListContent extends AbstractContent<List<Integer>> {
    List<Integer> content;

    public IntegerListContent(List<Integer> content) {
        this.content = content;
    }

    @Override
    List<Integer> getContent() {
        return content;
    }
}

class Main {
    public static void main(String[] args) {
        //   StringContent stringContent = new StringContent("Hello");
        AbstractContent integerListContent = new IntegerListContent(Arrays.asList(1, 2, 3));
        AbstractContent stringListContent = new StringListContent(Arrays.asList("a", "b", "c"));

        //showContent(stringContent);
        showContent(integerListContent);
        showContent(stringListContent);
    }

    static <T> void showContent(AbstractContent abstractContent) {
        System.out.println(abstractContent.getContent());
    }
}


