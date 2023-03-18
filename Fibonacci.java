/**
 * In fibonacci series, next number is the sum of previous two numbers 
 * for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
 */

public class Fibonacci {

    public static void fib(int num){
        int n1=0, n3=0, n2=1;
        System.out.print(n1+ " "+n2);

        for (int index = 2; index <=num; index++) {
            n3= n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
    public static void main(String[] args) {
        fib(20);
    }
}
