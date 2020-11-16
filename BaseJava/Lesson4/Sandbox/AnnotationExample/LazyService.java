package BaseJava.Lesson4.Sandbox.AnnotationExample;

@Service(name = "SuperLazyService")
public class LazyService {
    @Init
    void lazyInit() {
        System.out.println("LazyInit method");
    }
}
