package BaseJava.Lesson4.Sandbox.AnnotationExample;

@Service(name = "MegaSimpleService")
public class SimpleService {
    @Init
    void initService() {
        System.out.println("SimpleService method");
    }

    void anotherMethod() {
        System.out.println("Hello from another method");
    }
}
