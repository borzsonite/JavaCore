package JavaMentor.Модуль_6_Generics_Collections.Generics_6_1.Sandbox.Hexlet;

public class L3_Multitypes {

    public static void main(String[] args) {
        Student student = new Student(1, "Ivan");
        System.out.println(student.getId());
        System.out.println(student.getName());
    }


    static class Student<T1, T2> {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
