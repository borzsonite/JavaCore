package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox;
import java.util.*;

public class Test3 {
    public static void main(String []args) {
        List<String> list = Arrays.asList("Hello", "World");
        List<Integer> intList = Arrays.asList(1,2,3);
        List<Integer> data = new ArrayList<>(intList);
        Integer intNumber = data.get(0);
        System.out.println(data);
    }
}
