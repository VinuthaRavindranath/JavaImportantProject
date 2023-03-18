/**
 * A number is thought of as an Armstrong number in java 
 * if the sum of its own digits raised to the power number of digits gives the number itself.
 * For Example:153
 * 
 * 1*1*1=1
 * 5*5*5=125
 * 3*3*=27
 * 1+125+27=153
 */
public class Armstrong {

    public static void isArmstrongNumber(int num){
        int remainder, cube=0;
        int orignalNum=num;

        while (num>0) {
            remainder=num%10;
            num=num/10;
            cube=cube+(remainder*remainder*remainder); 
        }

        if (orignalNum==cube) {
            System.out.println(orignalNum+" is an Armstrong number");
        } else {
            System.out.println(orignalNum+"is not an Armstrong number");
        }
    }
    public static void main(String[] args) {
        isArmstrongNumber(153);
        isArmstrongNumber(121);
        isArmstrongNumber(1);
        isArmstrongNumber(370);


        
    }
}
