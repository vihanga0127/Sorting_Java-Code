package sortingmethods;

import java.util.Scanner;

public class SelectionSort {

    // Function to implement Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main function to test the Selection Sort
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
        
        // Perform selection sort on the array
        selectionSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);

        // Close the scanner
        scanner.close();
    }
}
