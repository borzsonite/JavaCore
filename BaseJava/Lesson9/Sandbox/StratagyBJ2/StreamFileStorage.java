package BaseJava.Lesson9.Sandbox.StratagyBJ2;

public class StreamFileStorage extends Strategy {
    @Override
    public void doRead() {
        System.out.println("FileStorage read");
    }

    @Override
    public void doWrite() {
        System.out.println("FileStorage write");
    }
}
