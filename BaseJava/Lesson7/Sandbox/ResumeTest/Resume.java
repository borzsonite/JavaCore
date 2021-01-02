package BaseJava.Lesson7.Sandbox.ResumeTest;
import java.util.Map;

public class Resume {
    private String uuid;
    private String fullName;
    private Map<ContactsSection, Contacts> contactsStorage;


    public Resume(String uuid, String fullName, Map<ContactsSection, Contacts> contacts) {
        this.uuid = uuid;
        this.fullName = fullName;
        contactsStorage = contacts;

    }

    public String getUuid() {
        return uuid;
    }

    public String getFullName() {
        return fullName;
    }

protected void creatResume() {
        Contacts contacts = new Contacts();
        contacts.setPhone("0475348753");
        contacts.setEmail("bob@mail.ru");
        contacts.setSkype("bobSkypeId");
        contacts.setHomepage("bobMarley.com");




}

    }
