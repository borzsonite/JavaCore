package BaseJava.Lesson3.Sandbox;

class Test {
    public static void process() {
        System.out.println("Hello");
    }
    public static void main(String s[]) {
         process(); //- ошибка!
        // у какого объекта его вызывать?

        Test test = new Test();
        test.process(); // так правильно
    }
}
