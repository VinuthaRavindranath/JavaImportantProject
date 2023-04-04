package JavaPrograms;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DistinctCharAndTheirCount {
    public static void distinctCharCount( String name){
        char[] ch=name.toCharArray();
        HashMap<Character,Integer>map=new HashMap<>();

        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1); 
            }
        }
       // System.out.println(name+":"+map);


        Set<Entry<Character,Integer>>entry=map.entrySet();
        for ( Entry<Character,Integer> e : entry) {
            if (e.getValue()<=1) {
                System.out.println("Distinct characters with count as 1:: "+e.getKey()+" : "+e.getValue());     
            }
            else{
                System.out.println("characters that repeate:: "+e.getKey()+" : "+e.getValue());     
            }
            
        }
    }

  


    public static void main(String[] args) {
        distinctCharCount("Apple");
       // distinctCharCount("Apple And Banana");

    }
}
