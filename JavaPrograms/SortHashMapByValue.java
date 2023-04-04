package JavaPrograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapByValue {

    public static void sortByValue(){
        HashMap<Integer,String>map= new HashMap<>();
        map.put(1103, "Micky");
        map.put(1003, "Donald");
        map.put(1203, "Arnold");
        map.put(1503, "Goofy");
        map.put(903, "Minni");


     List<Entry<Integer, String>> names=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
     System.out.println(names);

    }


    public static void sortByKey(){
        HashMap<Integer,String>map= new HashMap<>();
        map.put(1103, "Micky");
        map.put(1003, "Donald");
        map.put(1203, "Arnold");
        map.put(1503, "Goofy");
        map.put(903, "Minni");


     List<Entry<Integer, String>> names=map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
     System.out.println(names);

    }
    
    public static void main(String[] args) {
        sortByValue();
        sortByKey();
        
    }
}
