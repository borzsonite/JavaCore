package BaseJava.Lesson2.Sandbox;

public class Test {
Integer i = 5;
    //As soon as we run the program, it loads all the Runtime classes into the Heap space.

    public static void main(String[] args) { // Line 1. When the main() method is found at line 1, Java Runtime creates stack memory to be used by main() method thread.
        int i=1; // Line 2. We are creating primitive local variable at line 2, so it’s created and stored in the stack memory of main() method.
        Object obj = new Object(); // Line 3. Since we are creating an Object in the 3rd line, it’s created in heap memory and stack memory contains the reference for it.
        Test mem = new Test(); // Line 4. A similar process occurs when we create Memory object in the 4th line.
        mem.foo(obj); // Line 5 Now when we call the foo() method in the 5th line, a block in the top of the stack is created to be used by the foo() method. Since Java is pass-by-value, a new reference to Object is created in the foo() stack block in the 6th line.
    } // Line 9. In line 9, main() method terminates and the stack memory created for main() method is destroyed. Also, the program ends at this line, hence Java Runtime frees all the memory and ends the execution of the program.

    private void foo(Object param) { // Line 6
        String str = param.toString(); //// Line 7. A string is created in the 7th line, it goes in the String Pool in the heap space and a reference is created in the foo() stack space for it.
        System.out.println(str);
    } // Line 8. foo() method is terminated in the 8th line, at this time memory block allocated for foo() in stack becomes free.
}
