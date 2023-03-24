package OOPSConcepts.MethodOverloading;
/**The answer is, yes, we can overload the main() method. 
 * But remember that the JVM always calls the original main() method. 
 * It does not call the overloaded main() method. */

public class MainMethodOverloading {

    // JVM -- main - PVSM - string[]
    public static void main(String[] args) {
        System.out.println("Main method");
    }

    public static void main(String name) {
        System.out.println("Main method2");
    }

    public static void main(String name, int i) {
        System.out.println("Main method3");
    }
}
