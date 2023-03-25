package JavaImpTopics.Static;

/**
 * Program of counter by static variable
As we have mentioned above, static variable will get the memory only once, 
if any object changes the value of the static variable, it will retain its value.
 */
public class Counter2 {

    static int count = 0;

    public Counter2() {
        count++;// incrementing value
        System.out.println(count);
    }

    public static void main(String[] args) {

        Counter2 c1= new Counter2();
        Counter2 c2= new Counter2();
        Counter2 c3= new Counter2();

    }
    
}
