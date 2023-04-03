package JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMaxAndMinArray {
    public static void sortArrOne(){
        int n=6;
     
        int arr[] = new int[n];
        arr[0]=55;
        arr[1]=66;
        arr[2]=-47;
        arr[3]=88;
        arr[4]=34;
        arr[5]=12;
        
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
            System.out.print(a+ " ");
            
        }
        System.out.println("---->");
        System.out.println("Second largest::"+arr[1]);
        System.out.println("Second lowest::"+arr[n-2]);

    }

    public static void sortArrTwo(){
        int[] arr= {55,66,-47,88,34,12};
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.print(a+ " ");
            
        }
        int size=arr.length;
        System.out.println("---->");
        System.out.println("Second largest::"+arr[size-2]);
        System.out.println("Second lowest::"+arr[1]);
        
    }

    public static void sortArrThree(){
        List<Integer> list=Arrays.asList(55,66,-47,88,34,12);
        List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
        for (int a : sortedList) {
            System.out.print(a+ " ");
            
        }
        int size=sortedList.size();
        System.out.println("---->");
        System.out.println("Second largest::"+sortedList.get(size-2));
        System.out.println("Second lowest::"+sortedList.get(1));
    }
   


    public static void main(String[] args) {
    
        sortArrOne();
        sortArrTwo();
        sortArrThree();
    }

}

