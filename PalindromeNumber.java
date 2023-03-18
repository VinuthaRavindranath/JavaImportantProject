/**
 * A palindrome number is a number that remains the same when digits are reversed. 
 * For example, the number 12321 is a palindrome number
 */
public class PalindromeNumber {

    public static void isPalindromeNumber(int num){

        int remainder=0;
        int rev=0;
        int originalNum=num;

        while (num!=0) {
            remainder=num%10;
            rev=(rev*10)+remainder;
            num=num/10;
        }

        if (originalNum==rev) {
            System.out.println(originalNum+ "is a palindrome Number");
        }
        else{
            System.out.println(originalNum+ "is not a palindrome Number");
        }
    }


    public static void main(String[] args) {
        isPalindromeNumber(12321);
        isPalindromeNumber(123215);
        isPalindromeNumber(34543);     
    }
}
