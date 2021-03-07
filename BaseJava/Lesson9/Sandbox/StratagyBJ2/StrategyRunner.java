package BaseJava.Lesson9.Sandbox.StratagyBJ2;

public class StrategyRunner {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.setStrategy(new StreamFileStorage());
        storage.applyStrategy();

        storage.setStrategy(new StreamPathStorage());
        storage.applyStrategy();
    }
}
