package BaseJava.Lesson9.Sandbox.StratagyBJ2;

public class Storage {
    Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    void applyStrategy() {
        strategy.doRead();
        strategy.doWrite();
    }
}
