package JavaImpTopics;

public class CallByValueAndCallByRef {

    String name;
    int age;

    public int add(int a, int b) {// a and b are called parameter
        System.out.println("Sum of two numbers");
        int c = a + b;
        return c;
    }

    public void getInfo(CallByValueAndCallByRef cr) {
        cr.name = "Micky";
        cr.age = 20;
    }

    public static void main(String[] args) {
        CallByValueAndCallByRef c1 = new CallByValueAndCallByRef();
        int sum = c1.add(10, 20);// call by value by passing the arguments
        System.out.println(sum);

        /**null and 0 will be printed on the console as its getting the deafult values of the class variables */
        System.out.println(c1.name+" "+c1.age);

        /**
         * One object can have multiple refernces
         * cr is now pointing to c1 
         */
        c1.getInfo(c1);//call by reference
        System.out.println(c1.name+" "+c1.age);
    }

}
