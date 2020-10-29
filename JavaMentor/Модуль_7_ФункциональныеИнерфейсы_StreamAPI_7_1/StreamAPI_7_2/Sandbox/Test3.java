package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.util.*;

/**
 * Key:H.P. Lovecraft value:[This "The Shadow over Innsmouth" story is real masterpiece, Howard!]
 * <p>
 * Key:Christopher Nolan value:[Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!]
 * <p>
 * Key:H.P. Lovecraft value:[This "The Shadow over Innsmouth" story is real masterpiece, Howard!]
 * <p>
 * Key:Christopher Nolan value:[Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!]
 * <p>
 * Key:H.P. Lovecraft value:[This "The Shadow over Innsmouth" story is real masterpiece, Howard!]
 * <p>
 * [Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!]
 * <p>
 * [Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!, Я так и не понял Интерстеллар.]
 */

public class Test3 {

    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        //List<String> list4 = new ArrayList<>();
        List<String> arg2 = new ArrayList<>();
        arg2.add("четыре");
        list1.add("один");
        list2.add("два");
        list3.add("три");
       // list4.add("четыре");

        map.put("one", list1);
        map.put("two", list2);
        map.put("three", list3);


       // map.merge("three", list4, (a, b) -> a.addAll(b));
       // map.merge("three", arg2, (a, b)-> a.addAll(b));
        map.forEach((a, b) -> System.out.println("key:" + a + " | " + "value:" + b));
    }
}


