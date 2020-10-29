package JavaMentor.Модуль_5_ВводВыводДоступК_ФС.ДоступК_ФС_5_1.Sandbox.Клонирование;

public class CloneViaConstructor {
    static class Person {
        private int age;
        private String name;
        private CloneTest.Car car;

        public Person(int age, String name, CloneTest.Car car){
            this.age=age;
            this.name=name;
            this.car = car;
        }
        // конструктор копии
        public Person(Person other) {
            this(other.getAge(), other.getName(), other.getCar());
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CloneTest.Car getCar() {
            return car;
        }

        public void setCar(CloneTest.Car car) {
            this.car = car;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", car color is " + car.color +
                    '}';
        }

        public static void main(String[] args) {
            Person original = new Person(18, "Grishka", new CloneTest.Car("red"));
            Person clone = new Person(original);
            System.out.println(original);
            System.out.println(clone);
            clone.setName("Vaska");
            clone.setCar(new CloneTest.Car("green"));
            System.out.println(original);
            System.out.println(clone);

        }
    }
}
