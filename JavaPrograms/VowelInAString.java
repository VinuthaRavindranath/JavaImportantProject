package JavaPrograms;
import java.util.stream.Collectors;

public class VowelInAString {

    public static void getVowelsCountSolutionOne( String name){
        int count =0;
        char[] c1=name.toLowerCase().toCharArray();
        for (int index = 0; index < c1.length; index++) {
            if (c1[index]=='a'||c1[index]=='e'||c1[index]=='i'||c1[index]=='o'||c1[index]=='u') {
                System.out.println(c1[index]+ " is a vowel");
                ++count;
            }
            else{
                System.out.println(c1[index]+ " is not a vowel");
            }
        }
        System.out.println("Vowels count is:: "+count);
    }


    public static void getVowelsCountSolutionTwo(String name){
        String vowels =name.chars().filter(c->"aeiou".indexOf(c)>=0).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining()); 
        long count=name.chars().filter(c->"aeiouAEIOU".indexOf(c)>=0).count();
        System.out.println(vowels+" "+count);
    }
    

    public static void main(String[] args) {
        getVowelsCountSolutionOne("Vinutha");
        getVowelsCountSolutionTwo("Vinutha");
    }
}
