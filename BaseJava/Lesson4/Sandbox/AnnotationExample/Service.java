package BaseJava.Lesson4.Sandbox.AnnotationExample;
/**
Задача.
 1. Загрузить (создать экземпляр) класса помеченный @Service,
 2. пройти по всем методам этого класса,
 3. найти и вызвать методы помеченные анотацией @Init
 */

import java.lang.annotation.*;

@Documented // указывает, что класс помеченный данной аннотацией попадет в Javadoc
@Inherited // указывает, что анотация помеченная, данной анотацией будет наследоваться потомками классов
@Target(ElementType.TYPE) // указывает на область применения (.TYPE классы и интерфейсы)
@Retention(RetentionPolicy.RUNTIME) // указывает время жизни (во время работы приложения - runtime)
public @interface Service {
    String name();
    boolean lazyLoad() default false;
}
