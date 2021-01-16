package BaseJava.Lesson7.Sandbox.ResumeTest;

public abstract class AbstractSection<T> {
    private T content;
    protected abstract void setContent(T content);
    protected abstract T getContent(T content);

}
