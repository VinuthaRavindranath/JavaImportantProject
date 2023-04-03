package JavaPrograms;

import java.util.Arrays;

public class SortArrayWithoutInBuiltFunc {
    
    public static void sortArrAscendingOrder(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
            
        }
        for (int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println("------->");
      
    }

    public static void sortArrDescendingOrder(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
            
        }
        for (int a : arr) {
            System.out.print(a+" ");
        }
        System.out.println("------->");
    }

    public static void usingInBuilt(int[] arr){
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.print(a+" ");
        }

    }



    public static void main(String[] args) {
        int[] arr= {55,66,-47,88,34,12};
        sortArrAscendingOrder(arr);
        sortArrDescendingOrder(arr);
        usingInBuilt(arr);
    }

}
