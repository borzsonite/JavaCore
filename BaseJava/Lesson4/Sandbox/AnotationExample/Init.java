package BaseJava.Lesson4.Sandbox.AnotationExample;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Init {
    boolean supressException() default false;
}
