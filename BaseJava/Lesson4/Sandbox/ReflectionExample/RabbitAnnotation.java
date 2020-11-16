package BaseJava.Lesson4.Sandbox.ReflectionExample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {FIELD})
public @interface RabbitAnnotation {
    String name = "Hello";
}
