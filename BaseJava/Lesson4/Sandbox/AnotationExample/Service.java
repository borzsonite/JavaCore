package BaseJava.Lesson4.Sandbox.AnotationExample;

import java.lang.annotation.*;

@Documented
@Inherited // данная анотация будет унаследоваться потомками классов
@Target(ElementType.TYPE) // область применения над классами и интерфейсами
@Retention(RetentionPolicy.RUNTIME) // анотация будет жить во время выполения
public @interface Service {
    String name();
    boolean lazyLoad() default false;
}

