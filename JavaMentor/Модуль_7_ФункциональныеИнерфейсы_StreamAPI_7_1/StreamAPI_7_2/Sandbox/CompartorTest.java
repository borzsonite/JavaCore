package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.sql.SQLOutput;
import java.util.*;

public class CompartorTest {

    public static void main(String[] args) {
        List<Message> messages = new ArrayList();
        messages.add(new Message("Hello, World!"));
        messages.add(new Message("Hello, Sun!"));
        messages.add(new Message("Hello, Sun!"));
        messages.add(new Message("Hello, Sun!"));
        System.out.println(messages);


        Comparator<Message> comparator = new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {
                return o2.getId().compareTo(o1.getId());
            }
        };

        Comparator<Message> comparator1 = (o1, o2) -> o1.getId().compareTo(o2.getId());
        Comparator<Message> comparator2 = Comparator.comparing(obj -> obj.getId());

        Collections.sort(messages,comparator2);
        System.out.println(messages);
    }



    public static class Message {
        private String message;
        private int id;

        public Message(String message) {
            this.message = message;
            this.id = new Random().nextInt(1000);
        }

        public String getMessage() {
            return message;
        }

        public Integer getId() {
            return id;
        }

        public String toString() {
            return "[" + id + "] " + message;
        }
    }
}
