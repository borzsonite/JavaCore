package BaseJava.Lesson7.Sandbox.ResumeTest;

public class TestResume {
    private String uuid;
    private String fullName;
    private Experience experienceSection;
    private StringSection stringSection;

    public TestResume(String uuid, String fullName, Experience experienceSection, StringSection stringSection) {
        this.uuid = uuid;
        this.fullName = fullName;
        this.experienceSection = experienceSection;
        this.stringSection = stringSection;
    }

    public String getUuid() {
        return uuid;
    }

    public String getFullName() {
        return fullName;
    }

    public Experience getEducationSection() {
        return experienceSection;
    }
}
