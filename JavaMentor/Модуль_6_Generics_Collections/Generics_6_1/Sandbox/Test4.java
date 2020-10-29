package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox;
import java.util.*;
public class Test4 {
    public static class Util {
        public static <T> T getValue(Object obj, Class<T> clazz) {
            return (T) clazz;
        }
//        public static <T> T getValue(Object obj) {
//            return (T) obj;
//        }
    }

    public static void main(String []args) {
        List list = Arrays.asList("Author", "Book");
        for (Object element : list) {
            String data = Util.getValue(element, String.class);
            System.out.println(data);
           // System.out.println(Util.<String>getValue(element));
        }
    }
}
