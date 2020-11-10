package BaseJava.Lesson4.Sandbox;

/**
 Каждый объект в Java может участвовать в операции конкатенации (соединения) строк, в этом случае используется метод toString() , (если ссылка на объект равна null, то используется строка "null" ):
 * */
public class Test1 {
    static Object obj1 = new Object() {
        @Override
        public String toString() {
            return "obj1toString()";
        }
    };

    public static void main(String[] args) {
        Integer integer1 = 23;
        java.math.BigDecimal bigDecimal1 = new java.math.BigDecimal("3.45");
        Object obj2 = null;
        System.out.println("obj1: " + obj1 + "; integer1: "
                + integer1 + "; bigDecimal1: "
                + bigDecimal1 + "; obj2: " + obj2);
    }

}
