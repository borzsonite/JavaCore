package BaseJava.Lesson4.Sandbox.TestsSpecialist;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    @Rule
    public TestRule timeout = new Timeout(100);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
       // System.out.println("add");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = MyMath.add(2, 3);
        assertEquals(expResult, result);
        //fail("The test case is prototype");
    }

    @Test(expected = ArithmeticException.class)
    public void div() {
       // System.out.println("div");
        assertEquals(MyMath.div(6,3), 2);
    }
}