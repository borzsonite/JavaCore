package BaseJava.Lesson5.Sandbox;

// работа коллекций. Проитерировать коллекцию и удалить элемент

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Bob");
        collection.add("Tom");
        collection.add("Mike");

        System.out.println(collection.toString());
        for (String elem: collection) {
            if(elem.equals("Bob")) {
                 //collection.remove(elem); // нельзя применять метод remove() к элементу коллекцииж
            }
        }

        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().equals("Bob")) {
                iterator.remove();
            }
        }
        System.out.println(collection.toString());


    }
}
