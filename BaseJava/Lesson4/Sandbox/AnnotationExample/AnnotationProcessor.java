package BaseJava.Lesson4.Sandbox.AnnotationExample;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationProcessor {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);
        System.out.println(String.class);
        System.out.println("helle".getClass());
    }

    static void inspectService(Class<?> service) {
        if(service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name() + " | lazyLoad:" + ann.lazyLoad());
            for(Method method: service.getDeclaredMethods()) {
              //  System.out.println(method.getName());
                if(method.isAnnotationPresent(Init.class)) {
                    Init init = method.getAnnotation(Init.class);
                    System.out.println("found @Init method");

                }
            }

        } else {
            System.out.println("There is no annotations");
        }

    }
}
