package BaseJava.Lesson7.Sandbox.ResumeTest;

public enum ContactsSection {
    PHONE("Тел.:"),
    SKYPE("Skype"),
    EMAIL("Почта"),
    LINKEDIN("Профиль LinkedIn"),
    GITHUB("Профиль GitHub"),
    STACKOVERFLOW("Профиль StackOverflow"),
    HOMEPAGE("Домашняя страница");

    String title;

    ContactsSection(String title) {
        this.title = title;
    }
}
