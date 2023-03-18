public class MinAndMaxArray {

    public static void minAndMax(){

        int[] numbers={20,10,50,90,30,40};
        int max=numbers[0];
        int min =numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            if(numbers[index]>max){
                max=numbers[index];
            }
            else if(numbers[index]<min){
                min=numbers[index];
            }  
        }

        System.out.println("Minimum number is::"+min);
        System.out.println("Maximum number is::"+max);
    }

    public static void main(String[] args) {
        minAndMax();
    }
}
