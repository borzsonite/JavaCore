package JavaMentor.Модуль_7_ФункциональныеИнерфейсы_StreamAPI_7_1.ФункциональныеИнтерфейсы_7_1.Sandbox;

import java.util.Arrays;

public class Test2<compareByName> {

    class Person {
        private String name;
        private int Birthday;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBirthday() {
            return Birthday;
        }

        public void setBirthday(int birthday) {
            Birthday = birthday;
        }
    }

    class ComparisonProvider {
        public int compareByName(Person a, Person b) {
            return a.getName().compareTo(b.getName());
        }


    }

    ComparisonProvider myComparisonProvider = new ComparisonProvider();
    ;
}
