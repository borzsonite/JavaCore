package BaseJava.Lesson6.Sandbox;

@FunctionalInterface
interface Converter<T, F> {
    T convert(F from);
}

public class FunctionalInterfaceExample {
    Converter<String, Integer> convert = new Converter<String, Integer>() {
        @Override
        public String convert(Integer from) {
            String result = String.valueOf(from);
        }
    };
}
