/**
 * How to find Prime Number
 * Def of Prime Number:Prime numbers are numbers greater than 1. 
 * They only have two factors, 
 * 1 and the number itself. 
 * This means these numbers cannot be divided by any number other than 1 and the number itself without leaving a remainder.
 */
public class PrimeNumber {

    public static boolean isPrimeNumber(int num){

        if (num<=1) {
         //   System.out.println(num+" "+"is not a prime number");
            return false;
        }

        for (int index = 2; index < num; index++) {
            if (num%index==0) {
           //     System.out.println(num+" "+"is not a prime number");
                return false;
            }
        }
        return true;
    }

    public static void primeNumbers(int num){
        for (int index = 2; index < num; index++) {
            if (isPrimeNumber(index)) {
                System.out.println(index+" "+"is a prime number");
            }
        }
    }



    public static void main(String[] args) {
        primeNumbers(100);
    }

    
}