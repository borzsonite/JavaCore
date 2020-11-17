package BaseJava.Lesson4.Sandbox.ClassExample;

public class Test0 {
    private String name = "Hello";
    static Test0 test0 = new Test0();


    public static void main(String[] args) throws NoSuchFieldException {
        Class clazz = test0.getClass();
        System.out.println(Test0.class);
        System.out.println(test0.getClass());
        System.out.println(clazz.getDeclaredField("name"));
    }
}

