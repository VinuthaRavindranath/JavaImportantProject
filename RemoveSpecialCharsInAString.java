public class RemoveSpecialCharsInAString {
    /**
     * how to Remove Junk/Special Characters in a String by using Regular Expression:
     */

    public static void removeSpecialChar(String text){
        text=text.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println(text.trim());

    }
    
    public static void main(String[] args) {
        removeSpecialChar("拉丁文字 latin text 01234567890");
    }
}
