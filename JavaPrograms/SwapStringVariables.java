package JavaPrograms;

public class SwapStringVariables {

    public static void swapUsingThridVariable( String s1, String s2) {
        System.out.println(s1 + " and " + s2);
        String temp = "";

        temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println(s1 + " and " + s2);

    }

    public static void swapUsingWithoutThridVariable(String s1, String s2) {
        System.out.println(s1 + " and " + s2);
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println(s1 + " and " + s2);

    }

    public static void main(String[] args) {
        swapUsingThridVariable("Hello","World");
        swapUsingWithoutThridVariable("Hello","World");

    }
}
