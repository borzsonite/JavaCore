package JavaMentor.Модуль_6_Generics_Collections.Collections_6_2.Sandbox;

/**
 * Created by Alpha on 30.09.2020.
 */
public class ArrayUtils<E> {

    public static <E> E[] appendToArray(E[] array, E item) {
        E[] result = (E[])new Object[array.length+1];
        result[array.length] = item;
        return result;
    }

}
