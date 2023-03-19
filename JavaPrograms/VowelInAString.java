package JavaPrograms;

public class VowelInAString {

    public static void isVowel( String s1){
        int count =0;
        char[] c1=s1.toLowerCase().toCharArray();
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
    

    public static void main(String[] args) {
        isVowel("Vinutha");
    }
}
