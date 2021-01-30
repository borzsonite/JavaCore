package BaseJava.Lesson9.Sandbox.Strategy;

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human();
        human.setActivity(new Sleeping());
        human.makeActivity();
        human.setActivity(new Eat());
        human.makeActivity();
        human.setActivity(new Run());
        human.makeActivity();
    }
}
