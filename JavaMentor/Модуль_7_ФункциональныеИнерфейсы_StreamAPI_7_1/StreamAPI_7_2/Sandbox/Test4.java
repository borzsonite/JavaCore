package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.util.*;

public class Test4 {
    static HashMap<Integer, ArrayList<String>> items = new HashMap<Integer, ArrayList<String>>();
    static  ArrayList<String> list = new ArrayList<>();


    public static void main(String[] args) {
        list.add("one");
        items.put(1, list);
        addToList(1, "two");
        addToList(3,"three");
        addToList(300,"three");
        items.forEach((a,b)-> System.out.println("key:" + a + " value:" + b));


    }

    public static void addToList(Integer mapKey, String myItem) {
        ArrayList<String> itemsList = items.get(mapKey); // поскольку у нас вторым элементов в map'e идет List, создаем List и записываем в него значения для ключа mapKey
        System.out.println(items.get(null));
        // if list does not exist create it
        if(itemsList == null) {
            itemsList = new ArrayList<String>();
            itemsList.add(myItem);
            items.put(mapKey, itemsList);
        } else {
            // add if item is not already in list
            if(!itemsList.contains(myItem)) itemsList.add(myItem);
        }
    }
}

 class Cache<K, V> extends HashMap<K, V> {
    @Override
    public V get(Object key) {
        if (containsKey(key)) {
            return super.get(key);
        } else {
            V val = (V) Collections.<String>emptyList();
            put((K)key, val);    // this is the line I'm discussing below
            return val;
        }
    }

}
