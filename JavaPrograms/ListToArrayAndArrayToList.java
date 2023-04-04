package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayAndArrayToList {

    public static void arrayToList() {

        // create an array
        String[] array = { "Java", "Python", "C" };
        System.out.println("Array: " + Arrays.toString(array));

        // convert array to list
        List<String> languages = new ArrayList<>(Arrays.asList(array));

        System.out.println("List: " + languages);

    }

    public static void listToArray() {
        ArrayList<String> languages = new ArrayList<>();

        // Add elements in the list
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println("ArrayList: " + languages);

        // Create a new array of String type
        String[] arr = new String[languages.size()];

        // Convert ArrayList into the string array
        languages.toArray(arr);
        System.out.print("Array: ");
        for (String item : arr) {
            System.out.print(item + ", ");
        }
    }

    public static void main(String[] args) {
        arrayToList();
    }
}
