package JavaPrograms;

import java.util.HashMap;

public class WordsCount {

    public static void getWordsCount(String sentence){
        String[] words=sentence.split(" ");
        HashMap<String,Integer> wordsMap=new HashMap<>();

        for (String word : words) {
           if ( wordsMap.containsKey(word)) {
            wordsMap.put(word,wordsMap.get(word)+1);
           }
           else{
            wordsMap.put(word,1);
           }
        }
        System.out.println(sentence+":"+wordsMap);
    }
    public static void main(String[] args) {
        getWordsCount("I Love Automation Love");
        getWordsCount("I Love Automation");
    }
}
