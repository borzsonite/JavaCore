package BaseJava.Lesson4.Sandbox.ReflectionExample;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionChecker {

    void showClassName(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    void showClassFields(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields(); // .getDeclaredFields() возвращает массив объектов типа Field. Унаследованые поля не включаются.
        for (Field field: fields) {
            System.out.println(field.getName());
        }
    }

    void showClassMethod(Object object) {
        Class clazz = object.getClass();
        Method[] methods = clazz.getMethods();
        for(Method method: methods) {
            System.out.println(method.getName());
        }
    }

    void showFieldsAnnotations(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field: fields) {
            Annotation[] annotations = field.getAnnotations();
            for(Annotation annotation: annotations) {
                System.out.println(field.getName() + ":" + annotation.toString());
            }
        }
    }

    void fillPrivateFields(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field: fields) {
            Annotation annotation = field.getAnnotation(RabbitAnnotation.class);
        }
    }
}


