package BaseJava.Lesson9.Sandbox.StratagyBJ2;

public class StreamPathStorage extends Strategy {

    @Override
    public void doRead() {
        System.out.println("PathStorage read");
    }

    @Override
    public void doWrite() {
        System.out.println("PathStorage write");
    }
}
