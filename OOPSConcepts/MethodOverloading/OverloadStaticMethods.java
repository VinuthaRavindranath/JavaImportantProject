package OOPSConcepts.MethodOverloading;
/**
 * Can we overload static methods? 
The answer is ‘Yes’. 
We can have two or more static methods with the same name, but differences in input parameters. For example, consider the following Java program. 
 */
public class OverloadStaticMethods {
    
    public static void foo() {
        System.out.println("Test.foo() called ");
    }
    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }
    public static void main(String args[])
    {
        OverloadStaticMethods.foo();
        OverloadStaticMethods.foo(10);
    }
}
