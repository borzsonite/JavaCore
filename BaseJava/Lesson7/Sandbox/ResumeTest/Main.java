package BaseJava.Lesson7.Sandbox.ResumeTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Experience experienceSection = new Experience("ЮФУ",  LocalDate.of(1999, 12, 11),  LocalDate.of(2004, 12, 11), "Инженер");
        StringSection objectivesSection = new StringSection();
        List<String> objectivesSectionList = new ArrayList<>();
        objectivesSectionList.add("С 2013 года: разработка проектов \"Разработка Web приложения\",\"Java Enterprise\", \"Многомодульный maven.");

        TestResume resume = new TestResume("uuid1", "Bob", experienceSection, objectivesSection);
        System.out.println(resume.getEducationSection().dateFrom + "-" + resume.getEducationSection().dateTo);
    }
}
