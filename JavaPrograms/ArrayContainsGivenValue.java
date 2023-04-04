package JavaPrograms;

import java.util.stream.IntStream;

public class ArrayContainsGivenValue {

    public static void arrContainsValueSolutionOne(int[] arr, int toFind) {
        boolean found = false;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == toFind) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(toFind + " is found in the given array");
        } else {
            System.out.println(toFind + " is not found in the given array");
        }
    }

    public static void arrContainsValueSolutionTwo(int[] arr, int toFind) {
        boolean found = IntStream.of(arr).anyMatch(n -> n == toFind);
        if (found) {
            System.out.println(toFind + " is found in the given array");
        } else {
            System.out.println(toFind + " is not found in the given array");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 8, 2, 3 };
        arrContainsValueSolutionOne(arr, 3);
        arrContainsValueSolutionTwo(arr, 3);
    }
}
