package homework_week9;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class Programme_3ReverseArrayOfIntegerValues {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        printArray(originalArray);

        // Reverse the array
        int[] reversedArray = reverseArray(originalArray);

        System.out.println("Reversed Array: ");
        printArray(reversedArray);
    }

    // Function to reverse an array of integers
    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];
        for (int i = 0; i < length; i++) {
            reversedArray[i] = arr[length - 1 - i];
        }
        return reversedArray;
    }

    // Function to print an array of integers
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
