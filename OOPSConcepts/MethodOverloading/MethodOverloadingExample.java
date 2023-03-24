package OOPSConcepts.MethodOverloading;

public class MethodOverloadingExample {

    /**
     * overload static methods
     * @param a
     * @param b
     */
    public static void multiply(int a, int b){
        int mul=a*b;
        System.out.println(mul);

    }

    public static void multiply(int a, int b,int c){
        int mul=a*b*c;
        System.out.println(mul);

    }

    /**
     * overload non static methods
     * @param a
     * @param b
     */

    public void add(int a, int b){
        int sum=a+b;
        System.out.println(sum);

    }


    public void add(int a, int b,int c){
        int sum=a+b+c;
        System.out.println(sum);

    }


    /**
     * overload using one static and and one non static
     * @param a
     * @param b
     */
    public static void addition(int a, int b){
        int sum=a+b;
        System.out.println(sum);

    }

    public void addition(int a, int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
    }

    public static void main(String[] args) {

        MethodOverloadingExample.multiply(2, 3);
        MethodOverloadingExample.multiply(2, 3,2);


        MethodOverloadingExample mo= new MethodOverloadingExample();

        mo.add(10,20);
        mo.add(10, 10, 20);
        
        MethodOverloadingExample.addition(10, 20);
        mo.add(10, 10, 20);
        
    }
    
}
