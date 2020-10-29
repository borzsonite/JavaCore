package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Alpha on 08.10.2020.
 */
public class Task_7_2_10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pseudoRandomStream(13).toArray()));
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, s -> s * s%10000/10);
    }
}
