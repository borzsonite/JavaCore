package BaseJava.Lesson4.Sandbox.TestsSpecialist;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyMathTest {
    int a,b, expResult;

    public MyMathTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Rule
    public TestRule timeout = new Timeout(100);

    @Parameterized.Parameters
    public static Collection numbers() {
        return Arrays.asList(new Object [][] {{1,2,3}, {4,5,9}, {3,3,7}});
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
       // System.out.println("add");
//        int a = 2;
//        int b = 3;
//        int expResult = 5;
//        int result = MyMath.add(2, 3);
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
        //fail("The test case is prototype");
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void div() {
       // System.out.println("div");
        assertEquals(MyMath.div(6,0), 2);
    }
}