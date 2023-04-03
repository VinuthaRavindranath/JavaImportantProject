package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    
    public static void revArrOne(int[] arr){
        int len=arr.length;
        for (int index = len-1; index >=0; index--) {
            System.out.print(arr[index]+" "); 
        }
    }

    public static void revArrTwo(){
        System.out.println("--->");
        List<Integer> arr= Arrays.asList(55,66,-47,88,34,12);
        Collections.reverse(arr);
        System.out.println(arr);
    }


    public static void main(String[] args) {
        int[] arr= {55,66,-47,88,34,12};
        revArrOne(arr);
        revArrTwo();
    }

}

