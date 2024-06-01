package sortingmethods;

import java.util.Scanner;

public class InsertionSort {

    // Function to implement Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main function to test the Insertion Sort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Initialize the array to store user input
        int[] arr = new int[numElements];

        // Prompt the user to enter each element
        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Unsorted array:");
        printArray(arr);
        
        // Perform insertion sort on the array
        insertionSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);

        // Close the scanner
        scanner.close();
    }
}
