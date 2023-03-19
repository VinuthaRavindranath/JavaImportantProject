package JavaPrograms;
public class EvenOrOdd {

    public static boolean isEvenOrOdd(int num){
        if (num<=1) {
            return false;
        }

        for (int index = 2; index < num; index++) {
            if (num%2!=0) {
                return false;
             }
            
        }
        return true;
    }

    public static void evenNumbers(int num){
        for (int index = 2; index <= num; index++) {
            if (isEvenOrOdd(index)) {
                System.out.println(index);
            } 
            
        }

    }



    public static void main(String[] args) {
        
        evenNumbers(100);
    }
}
