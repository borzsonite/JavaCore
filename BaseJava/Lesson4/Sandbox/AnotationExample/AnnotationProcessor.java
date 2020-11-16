package BaseJava.Lesson4.Sandbox.AnotationExample;

public class AnnotationProcessor {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

    }

    static void inspectService(Class<?> service) {
        
    }
}

