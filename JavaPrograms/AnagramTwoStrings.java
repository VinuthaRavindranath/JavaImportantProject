package JavaPrograms;

import java.util.Arrays;

public class AnagramTwoStrings {

    public static boolean isAnagramSolutionOne(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        } else {

            char[] c1 = s1.toLowerCase().toCharArray();
            char[] c2 = s2.toLowerCase().toCharArray();
            char temp;

            for (int index = 0; index < c1.length; index++) {
                for (int j = index + 1; j < c1.length; j++) {
                    if (c1[index] > c1[j]) {
                        temp = c1[index];
                        c1[index] = c1[j];
                        c1[j] = temp;
                    }
                }
            }

            for (int index = 0; index < c2.length; index++) {
                for (int j = index + 1; j < c2.length; j++) {
                    if (c2[index] > c2[j]) {
                        temp = c2[index];
                        c2[index] = c2[j];
                        c2[j] = temp;
                    }
                }
            }

            if (Arrays.equals(c1, c2)) {
                System.out.println("Strings are anagram");
                return true;
            }
            System.out.println("Strings are not anagram");
            return false;
        }
    }

    public static void isAnagramSolutionTwo(String s1, String s2) {

        String s3 = s1.replaceAll("\\s", "").toLowerCase();
        String s4 = s2.replaceAll("\\s", "").toLowerCase();

        if (s3.length() != s4.length()) {
            System.out.println("The length of these two strings are not same");
        } else {
            char[] c1 = s3.toCharArray();
            char[] c2 = s4.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1, c2)) {
                System.out.println("Strings are anagram");

            } else {
                System.out.println("Strings are not anagram");
            }
        }
    }

    public static void main(String[] args) {
        isAnagramSolutionOne("Silent", "Listen");
        isAnagramSolutionTwo("ELVIS", "levis");
    }
}
