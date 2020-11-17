package BaseJava.Lesson4.Sandbox.TestsSpecialist;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JavaUnitTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MyMathTest.class);
        for(Failure failure: result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
        System.out.println(MyMath.add(2,3));
    }
}
