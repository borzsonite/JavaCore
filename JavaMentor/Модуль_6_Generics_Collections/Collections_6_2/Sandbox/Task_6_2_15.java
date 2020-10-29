package JavaMentor.Модуль_6_Generics_Collections.Collections_6_2.Sandbox;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Магазину нужно сохранять информацию о продажах для каждого сотрудника. Напишите метод Map getSalesMap(Reader reader) который принимает Reader содержащий строки вида:

Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Метод должен получить все строки из Readera и заполнить и вернуть карту где ключом будет имя сотрудника, а значением сумма всех его продаж.

Пример ввода:


Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Пример вывода:
{Алексей=[10000], Дмитрий=[9000], Антон=[11000]}
 **/

public class Task_6_2_15 {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream("Алексей 3000\nДмитрий 9000\nАнтон 3000\nАлексей 7000\nАнтон 8000".getBytes());
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(bais));
        System.out.println(getSalesMap(buffReader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        BufferedReader input = new BufferedReader(reader);
        Map<String, Long> map = new HashMap<>();
        String line;

        try {
            while ((line = input.readLine()) != null) {
                String key = line.split(" ")[0];
                Long value = Long.parseLong(line.split(" ")[1]);
                if(map.containsKey(key)) {
                   map.merge(key, map.get(key), (a, b) -> map.get(key) + value );
                } else map.put(key, value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  map;
    }
}
