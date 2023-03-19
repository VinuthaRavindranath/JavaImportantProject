package JavaPrograms;
public class FindMissingNumberInArray {

    public static void findMissingNumber(){

        int a[]={1,2,4,5};
        int sum=0;
        int sum1=0;

        for (int index = 0; index < a.length; index++) {
            sum=sum+a[index];
        }
        System.out.println(sum);

        for (int index = 1; index <=5; index++) {
            sum1=sum1+index;
        }
        System.out.println(sum1);

        System.out.println("Missing number is ::"+(sum1-sum));
    }
    
    public static void main(String[] args) {
        findMissingNumber();
    }
}
