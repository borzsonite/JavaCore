package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.StreamAPI_7_2.Sandbox;

import java.util.*;
import java.util.function.*;

public class Task_7_2_13 {
    public static void main(String[] args) {

        // Random variables
        String randomFrom = "Bill Gates"; // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        String randomTo = "Bill Clinton";  // Некоторая случайная строка. Можете выбрать ее самостоятельно.
        int randomSalary = 100;  // Некоторое случайное целое положительное число. Можете выбрать его самостоятельно.

// Создание списка из трех почтовых сообщений.
        MailMessage firstMessage = new MailMessage(
                "Robert Howard",
                "H.P. Lovecraft",
                "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!");

        assert firstMessage.getFrom().equals("Robert Howard") : "Wrong firstMessage from address"; // Если в левой части false, выводится правая часть
        assert firstMessage.getTo().equals("H.P. Lovecraft") : "Wrong firstMessage to address";
        assert firstMessage.getContent().endsWith("Howard!") : "Wrong firstMessage content ending";

        MailMessage secondMessage = new MailMessage(
                "Jonathan Nolan",
                "Christopher Nolan",
                "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!"
        );

        MailMessage thirdMessage = new MailMessage(
                "Stephen Hawking",
                "Christopher Nolan",
                "Я так и не понял Интерстеллар."
        );

        List<MailMessage> messages = Arrays.asList(
                firstMessage, secondMessage, thirdMessage
        );

// Создание почтового сервиса.
        MailService<String> mailService = new MailService<>();

// Обработка списка писем почтовым сервисом
        messages.stream().forEachOrdered(mailService); // прогоняем все сообщения чрез почтовый сервис

// Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список сообщений, которые были ему отправлены
        Map<String, List<String>> mailBox = mailService.getMailBox(); // почтовый ящик = ключ : List<String>

        assert mailBox.get("H.P. Lovecraft").equals(
                Arrays.asList(
                        "This \"The Shadow over Innsmouth\" story is real masterpiece, Howard!"
                )
        ) : "wrong mailService mailbox content (1)";


        assert mailBox.get("Christopher Nolan").equals(
                Arrays.asList(
                        "Брат, почему все так хвалят только тебя, когда практически все сценарии написал я. Так не честно!",
                        "Я так и не понял Интерстеллар."
                )
        ) : "wrong mailService mailbox content (2)";

        assert mailBox.get(randomTo).equals(Collections.<String>emptyList()) : "wrong mailService mailbox content (3)";


// Создание списка из трех зарплат.
        Salary salary1 = new Salary("Facebook", "Mark Zuckerberg", 1);
        Salary salary2 = new Salary("FC Barcelona", "Lionel Messi", Integer.MAX_VALUE);
        Salary salary3 = new Salary(randomFrom, randomTo, randomSalary);

// Создание почтового сервиса, обрабатывающего зарплаты.
        MailService<Integer> salaryService = new MailService<>();

// Обработка списка зарплат почтовым сервисом
        Arrays.asList(salary1, salary2, salary3).forEach(salaryService); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        salaryService.getMailBox().forEach((a,b)-> System.out.println("key:" + a + " val:" + b));

// Получение и проверка словаря "почтового ящика",
//   где по получателю можно получить список зарплат, которые были ему отправлены.
        Map<String, List<Integer>> salaries = salaryService.getMailBox();
        assert salaries.get(salary1.getTo()).equals(Arrays.asList(1)) : "wrong salaries mailbox content (1)";
        assert salaries.get(salary2.getTo()).equals(Arrays.asList(Integer.MAX_VALUE)) : "wrong salaries mailbox content (2)";
        assert salaries.get(randomTo).equals(Arrays.asList(randomSalary)) : "wrong salaries mailbox content (3)";

    }

    ////////////////Sendable////////////////
    public static interface Sendable<T> {
        String getFrom();
        String getTo();
        T getContent();
    }

    ////////////////MailMessage////////////////
    public static class MailMessage implements Sendable<String> {
        // implement here
        private String from;
        private String to;
        private String content;

        public MailMessage(String from, String to, String content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public String getContent() {
            return content;
        }
    }

    ////////////////Salary////////////////
    public static class Salary implements Sendable<Integer> {
        private final String from;
        private final String to;
        private final int content;

        public Salary(String from, String to, int content) {
            this.from = from;
            this.to = to;
            this.content = content;
        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        @Override
        public Integer getContent() {
            return content;
        }
    }

    ////////////////MailService////////////////
    public static class MailService<T> implements Consumer<Sendable<T>> { //implements Consumer<> нужен  чтобы на объекте MailService в его метод .accept() можно было передать параметром любой объект имплементирущий Sendable<T>.

        class myMap<K, V> extends HashMap<K, V> {
            public V get(Object key) {
                V temp = super.get(key);
                if(temp == null) {
                    temp = (V) Collections.<String>emptyList();
                }
                return temp;
            }
        }

        Map<String, List<T>> mailBox = new myMap<>();

        public void accept(Sendable<T> tSendable) {
            List<T> value = new ArrayList<>();
            value = mailBox.get(tSendable.getTo());
            if(value == null) {
                value = new ArrayList<>();
                value.add(tSendable.getContent());
                mailBox.put(tSendable.getTo(), value);
            } else {
                if(!value.contains(tSendable.getContent())) {
                    List<T> valueCopy = new ArrayList<>(value);
                    valueCopy.add(tSendable.getContent());
                    mailBox.put(tSendable.getTo(), valueCopy);
                }
            }

            /**
             tSendable содержит поля to from content. В mailbox помещается в качестве ключа поле to, а в качестве значения создается List в который дописываются значения из поля content .getContent()
             * */
     //mailBox.forEach((a,b)-> System.out.println("key:" + a + " value:" + b));
        }

        public Map<String, List<T>> getMailBox() {
            return mailBox;
        }
    }
}
