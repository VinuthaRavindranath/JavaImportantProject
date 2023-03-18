import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesElementsInAnArray {

    public static String programmingLanguages[]={"Java","C","C#","Python","JavaScript","Ruby","Go","Java","C"};


    /**
     * this approach is not good as the time complexity is On2 
     */
    public static void findDuplicateElementsUsingForLoops(){

        for (int i = 0; i < programmingLanguages.length; i++) {
            for (int j = i+1; j < programmingLanguages.length; j++) {
                
                if (programmingLanguages[i].equals(programmingLanguages[j])) {
                    System.out.println("Duplicate string is ::"+ programmingLanguages[i]);
                    
                }
            }
            
        }

    }

    /**
     * this approach is using HashSet
     */
    public static void findDuplicateElementsUsingHashSet(){

        HashSet<String> languages= new HashSet<String>();
        for (String language  : programmingLanguages) {
            if (languages.add(language)==false) {
                System.out.println("Duplicate string is ::"+language);
            }
        }
    }


    /**
     * This approach is using HashMap
     */

    
    public static void findDuplicateElementsUsingHashMap(){

        Map<String,Integer> map= new HashMap<String,Integer>();
        for (String lang : programmingLanguages) {
            Integer count=map.get(lang);
            if (count==null) {
                map.put(lang, 1);
            }
            else{
                map.put(lang, ++count); 
            }   
        }

       Set<Entry<String, Integer>>entry= map.entrySet();
       for (Entry<String, Integer> lang : entry) {
        if (lang.getValue()>1) {
            String duplicate=lang.getKey();
            System.out.println("Duplicate string is ::"+duplicate);
        }
        
       }
    }
    
    public static void main(String[] args) {
       findDuplicateElementsUsingForLoops();
       findDuplicateElementsUsingHashSet();
       findDuplicateElementsUsingHashMap();
    }
}
