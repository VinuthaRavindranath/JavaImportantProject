
public class Prac {

    public static void solution(){
        int num=100;

        for (int index = 1; index <=num; index++) {
            if (index%3==0 && index%5==0) {
                System.out.println("FizzBuzz");
            }
            else if (index%3==0) {
                System.out.println("Fizz");
            }
            else if (index%5==0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(index);
            }
            
        }
     
    }



public static void main(String[] args) {
    solution();
    
}
}
