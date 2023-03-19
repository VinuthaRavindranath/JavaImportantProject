package JavaPrograms;

import java.util.Arrays;

public class SortString {

    public static void sortSolutionOne(String str){
        char temp;
        char[] arr=str.toCharArray();

        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;     
                }
            }
        }
        System.out.println(arr);
    }


    public static void sortSolutionTwo(String str){
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
    }


    public static void main(String[] args) {
        sortSolutionOne("java");
        sortSolutionTwo("java");
    }
    
}
