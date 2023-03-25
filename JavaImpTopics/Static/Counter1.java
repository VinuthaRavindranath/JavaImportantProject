package JavaImpTopics.Static;

/**
 * Program of the counter without static variable
In this example, we have created an instance variable named count which is incremented in the constructor.
 Since instance variable gets the memory at the time of object creation, each object will have the copy of the instance variable. 
 If it is incremented, it won't reflect other objects. So each object will have the value 1 in the count variable.
 */
public class Counter1 {

    int count = 0;

    public Counter1() {
        count++;// incrementing value
        System.out.println(count);
    }

    public static void main(String[] args) {

        Counter1 c1= new Counter1();
        Counter1 c2= new Counter1();
        Counter1 c3= new Counter1();

    }

}
