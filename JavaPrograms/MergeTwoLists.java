package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoLists {

    public static void mergeIntegerLists(){
        List<Integer> l1=Arrays.asList(1,2,3,4,5);
        List<Integer> l2=Arrays.asList(6,7,8,9,10);

        List<Integer> mergedList= new ArrayList<>();
        mergedList.addAll(l1);
        mergedList.addAll(l2);

        System.out.println(mergedList);
    }

    public static void mergeStringLists(){
        List<String> l1=Arrays.asList("Apple","Banana","Grapes");
        List<String> l2=Arrays.asList("Orange","Kiwi","Plum");

        List<String> mergedList= new ArrayList<>();
        mergedList.addAll(l1);
        mergedList.addAll(l2);

        System.out.println(mergedList);
    }
    
    public static void main(String[] args) {
        mergeIntegerLists();
        mergeStringLists();
    }
}
