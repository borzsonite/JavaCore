package BaseJava.Lesson2.Sandbox;
/**
 Рассмотрим такое свойство живого организма, как способность питаться насекомыми. Очевидно, что это свойство нельзя приписать всей группе птиц, или млекопитающих, а тем более растений. Но существуют представители каждой из названных групп, которые этим свойством обладают, – для растений это росянка, для птиц, например, ласточки, а для млекопитающих – муравьеды. Причем, очевидно, "реализовано" это свойство у каждого вида совсем по-разному.

 Можно было бы объявить соответствующий метод (скажем, consumeInsect(Insect) ) у каждого представителя независимо. Но если задача состоит в моделировании, например, зоопарка, то однотипную процедуру – кормление насекомыми – пришлось бы описывать для каждого вида отдельно, что существенно осложнило бы код, причем без какой-либо пользы.

 Java предлагает другое решение. Объявляется интерфейс InsectConsumer:
 * */

public class Test3 {
    static class Insect {

    }

    static class Birds {

    }

    static class Plants {

    }

    static class Animals {

    }

    interface InsectConsumer {
        void EatInsect(Insect insect);
    }

    static class Lastochka extends Birds implements InsectConsumer {
        @Override
        public void EatInsect(Insect insect) {
            System.out.println("Lastochka is eating...");
        }
    }

    static class Rosynka extends Plants implements InsectConsumer {
        @Override
        public void EatInsect(Insect insect) {
            System.out.println("Rosynka is eating...");
        }
    }

    static class Muravied extends Animals implements InsectConsumer {
        @Override
        public void EatInsect(Insect insect) {
            System.out.println("Muravied is eating...");
        }
    }

    static class Worker {
        void feed(InsectConsumer insectConsumer, Insect insect) {
            insectConsumer.EatInsect(insect);
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.feed(new Lastochka(), new Insect());
        worker.feed(new Rosynka(), new Insect());
        worker.feed(new Muravied(), new Insect());
    }
}
