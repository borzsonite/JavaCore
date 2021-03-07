package BaseJava.Lesson11.Sandbox;

import java.util.ArrayList;
import java.util.List;

public class Test3_1 {
    public static void main(String[] args) {
        Runner  runner = new Runner();

        long start = System.currentTimeMillis();
        long end;
        runner.calc1();
        runner.calc2();
        end = System.currentTimeMillis() -start;
        System.out.println(end);
    }


}

class Runner {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    void calc1() {
        int i=0;
        for(;i<1000000; i++) {
            list1.add(i);
        }
        System.out.println(list1.size());
    }

    void calc2() {
        int i=0;
        for(; i<1000000; i++) {
            list2.add(i);
        }
        System.out.println(list2.size());
    }
}
