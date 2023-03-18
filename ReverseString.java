public class ReverseString {

    public static String reverse(String s){
        String rev="";
        int len=s.length();
        for (int index = len-1; index>=0; index--) {
            rev=rev+s.charAt(index);   
        }
        return rev;
    }

    public static StringBuilder reverseStringBuilder(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb;
    }

    public static String reverseEachWord(String s) {
        String[] s1=s.split(" ");
        String revWord="";
        for (String s2 : s1) {
            String s3=reverse(s2);
            revWord=revWord+s3+" ";
        }
        return revWord;

    }

    public static String reverseEachWordWithBuilder(String s){
        String word="";
        String[] s3=s.split(" ");
        for (String v : s3) {
            StringBuilder sb2=reverseStringBuilder(v);
            word=word+sb2.toString()+ " ";
        }
        return word;
    }
    

    public static void main(String[] args) {
       String s1=reverse("Hello World");
       StringBuilder s2=reverseStringBuilder("Hello World");
       String s3=reverseEachWord("Hello World");
       String s4=reverseEachWordWithBuilder("Hello World");
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
       
    }
}
