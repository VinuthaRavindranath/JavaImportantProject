/**
Say Fizz if the number is divisible by 3.
Say Buzz if the number is divisible by 5.
Say FizzBuzz if the number is divisible by both 3 and 5.
Return the number itself, if the number is not divisible by 3 and 5.
 */
public class FizzBuzz {

    public static void checkFizzBuss(){
        int num=100;
        for (int index = 1; index <= num; index++) {
            if (index%3==0 && index%5==0) {
                System.out.println("FizzBuzz");
            }
            else if (index%5==0){
                System.out.println("Buzz");
            }
            else if(index%3==0){
                System.out.println("Fizz");

            }
            else{
                System.out.println(index);
            }
            
        }
    }
    

    public static void main(String[] args) {
        checkFizzBuss();
    }
}
