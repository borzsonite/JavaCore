package BaseJava.Lesson7.Sandbox;

public class GenericsType<T> {
    private T t;

    public T get(){
        return this.t;
    }

    public void set(T t1){
        this.t=t1;
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType<>();
        type.set("Pankaj"); //valid

        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Pankaj"); //valid
        type1.set(10); //valid and autoboxing support

        GenericsType<String> type3 = new GenericsType<>();
        type3.set("Pankaj");

        boolean isEqual = GenericsType.isEqual(type, type3);
        System.out.println(isEqual);

    }

    public static <R> boolean isEqual(GenericsType<R> obj1, GenericsType<R> obj2) {
        return obj1.get().equals(obj2.get());
    }
}
