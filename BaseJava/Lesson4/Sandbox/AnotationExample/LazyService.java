package BaseJava.Lesson4.Sandbox.AnotationExample;

@Service(name = "SuperLazy")
public class LazyService {
    @Init
    void lazyInit() throws Exception {
        System.out.println("LazyService");
    }
}
