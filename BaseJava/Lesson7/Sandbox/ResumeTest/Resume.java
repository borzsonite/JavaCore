package BaseJava.Lesson7.Sandbox.ResumeTest;

import java.util.Map;
import java.util.TreeMap;

public class Resume {
    private String uuid;
    private String fullName;
    private static Map<ContactsSection, String> contactsStorage;


    public Resume(String uuid, String fullName, Map<ContactsSection, String> contacts) {
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

    public static void main(String[] args) {
        creatResume();
    }

    protected static void creatResume() {
        Contacts contacts = new Contacts();
        contacts.setPhone("0475348753");
        contacts.setEmail("bob@mail.ru");
        contacts.setSkype("bobSkypeId");
        contacts.setHomepage("bobMarley.com");

        Map<ContactsSection, String> contactsSectionStringMap = new TreeMap<>();
        contactsSectionStringMap.put(ContactsSection.PHONE, contacts.setPhone("+767687687687"));
        Resume resume = new Resume("uuid1", "Bob", contactsSectionStringMap);
        System.out.println(resume.contactsStorage.get(ContactsSection.PHONE));
    }

}
