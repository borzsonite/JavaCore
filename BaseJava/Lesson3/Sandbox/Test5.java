package BaseJava.Lesson3.Sandbox;

public class Test5 {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getClass());
    }
    static class Child {
        static int var=1;
        public int getVar() {
            return var;
        }
    }
}
