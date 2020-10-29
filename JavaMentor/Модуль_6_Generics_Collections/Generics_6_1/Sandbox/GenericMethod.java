package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox;

public class GenericMethod {
    public static void main(String[] args) {
        System.out.println(genericMethod("Hello"));

    }

   static <T> T genericMethod(T t) {
       String res = t + " from gen";
        return (T)res;
    }
}
