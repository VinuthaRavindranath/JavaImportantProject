package JavaPrograms;
public class ReverseInteger {

    //public static int number = 12345;
    public static int rev = 0;

    public static void reverseNumber(int number) {
        while(number!=0){
            int remainder= number%10;
            rev =(rev*10)+remainder;
            number=number/10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        reverseNumber(12345);
    }
}
