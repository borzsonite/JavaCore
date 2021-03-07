package BaseJava.Lesson9.Sandbox.StrategyBJ;

public class ObjectStreamPathStorage extends AbstractPathStorage {
    @Override
    public void doRead() {
        System.out.println("Path read");
    }

    @Override
    public void doWrite() {
        System.out.println("Path write");
    }
}
