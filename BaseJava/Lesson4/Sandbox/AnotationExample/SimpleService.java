package BaseJava.Lesson4.Sandbox.AnotationExample;

@Service(name = "VerySimple")
public class SimpleService {
    @Init
   void initService() {
       System.out.println("Simple service");
    }

    void nonInitMethod() {
        System.out.println("I'm not init method");
    }
}
