package BaseJava.Lesson9.Sandbox.StrategyBJ;

public class ObjectStreamFileStorage extends AbstractFileStorage{
    @Override
    public void doRead() {
        System.out.println("File read");
    }

    @Override
    public void doWrite() {
        System.out.println("File write");
    }
}
