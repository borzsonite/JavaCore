package BaseJava.Lesson7.Sandbox.ResumeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StringSection {
    private Map<SectionType, List<String>> stringSectionsStorage;

    public void setStringSectionsStorage(SectionType key, List<String> value) {
        stringSectionsStorage.put(key, value);
    }
}

