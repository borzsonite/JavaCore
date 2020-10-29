package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

import java.util.function.*;

public class Test1 {

    public static void main(String[] args) {

        ToIntFunction<String> intParser = Integer::parseInt;
        System.out.println(intParser);
    }

    
}
