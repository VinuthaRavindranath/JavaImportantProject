package JavaPrograms;
public class PalindromeString {

    public static void isPalindromeString(String word){
        int len=word.length();
        String rev="";
        String originalWord=word;
        for (int index = len-1; index>=0; index--) {
            rev=rev+word.charAt(index);
        }

        if (originalWord.equals(rev)) {
            System.out.println(originalWord+"is a Palindrome String");
        } else {
            System.out.println(originalWord+"is not a Palindrome String");
        }
    }
    public static void main(String[] args) {
        isPalindromeString("level");
        isPalindromeString("Hello world");
    }
}
