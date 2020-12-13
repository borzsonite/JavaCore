package BaseJava.Lesson6.Sandbox;

import sun.plugin2.message.HeartbeatMessage;

public class Human {
    Relations relations;
    String name;
    int age;

    public static void main(String[] args) {
        Human max = new Human();
        max.relations = new Human.Relations("Single");
    }

    static class Relations {
        private final String name;

        Relations(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
