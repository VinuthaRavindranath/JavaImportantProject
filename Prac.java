
public class Prac {

    public static void solution(){
        int[] arr={1,2,4,5,6};
        int sum=0;
        int sum2=0;
        for (int index = 0; index < arr.length; index++) {
            sum=sum+arr[index];
            
        }
        System.out.println(sum);


        for (int index = 0; index <=6; index++) {
            sum2+=index;
        }
        System.out.println(sum2);
        System.out.println(sum2-sum);
    }



public static void main(String[] args) {
    solution();
    
}
}
