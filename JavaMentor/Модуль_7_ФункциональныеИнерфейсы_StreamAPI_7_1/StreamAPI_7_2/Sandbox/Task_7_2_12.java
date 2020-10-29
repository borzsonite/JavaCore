package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов, и в конце выводящую 10 наиболее часто встречающихся слов.
 * Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например, в строке "Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".
 * Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово. Выводите слова в нижнем регистре.
 * Если в тексте меньше 10 уникальных слов, то выводите сколько есть.
 * Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте, то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.
 * Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.
 */

public class Task_7_2_12 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String line = "";
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while ((line = reader.readLine()) !=null) {
                sb.append(line).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, Integer> words = new TreeMap<>();
        String[] array = sb.toString().split("[^a-zA-Zа-яА-Я0-9']+");

        for (String elem : array) {
            elem = elem.toLowerCase();
            if (!words.containsKey(elem)) {
                words.put(elem, 1);
            } else {
                int count = words.get(elem);
                words.put(elem, ++count);
            }
        }

        words.entrySet().stream()
                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
                .limit(10)
                .forEach(k -> System.out.println(k.getKey()));
    }
}
