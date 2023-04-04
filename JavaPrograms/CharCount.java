package JavaPrograms;
import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void getCharCount(String name){
        Map<Character,Integer> charMap=new HashMap<>();
        char[] strChar=name.toLowerCase().toCharArray();
        for (char c : strChar) {
            if (charMap.containsKey(c)) {
                charMap.put(c,charMap.get(c)+1);
            }
            else{
                charMap.put(c,1);
            }  
        }
        System.out.println(name+ " : "+charMap);

    }

    
    public static void main(String[] args) {
        getCharCount("test");
        getCharCount("test auto");
        getCharCount("t");
        getCharCount("tt");
        getCharCount("test auto ui");
        getCharCount("  ");
        getCharCount("test AUTOMATION");
        getCharCount(" test auto ");
        

    }
    
}
