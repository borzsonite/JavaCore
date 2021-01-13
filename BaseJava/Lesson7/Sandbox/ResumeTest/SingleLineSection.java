package BaseJava.Lesson7.Sandbox.ResumeTest;

public class SingleLineSection extends AbstractSection<String>{
    String content;

    @Override
    protected void setContent(String content) {
        this.content = content;
    }

    @Override
    protected String getContent(String content) {
        return content;
    }
}
