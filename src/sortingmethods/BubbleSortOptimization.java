package sortingmethods;

import java.util.Scanner; // Import the Scanner class for user input

public class BubbleSortOptimization {

    // Method to perform optimized bubble sort on an array
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Get the length of the array
        boolean swapped; // Flag to check if any swapping happened in a pass

        for (int i = 0; i < n - 1; i++) { // Outer loop for number of passes
            swapped = false; // Initially set swapped to false

            for (int j = 0; j < n - i - 1; j++) { // Inner loop for comparing adjacent elements
                if (arr[j] > arr[j + 1]) { // If current element is greater than the next element
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Set swapped to true indicating a swap occurred
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt(); // Read the number of elements in the array

        int[] arr = new int[n]; // Create an array of the specified size

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) { // Loop to read array elements from the user
            arr[i] = scanner.nextInt(); // Read each element and store it in the array
        }

        System.out.println("Unsorted array:");
        for (int num : arr) { // Loop to print the unsorted array
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(arr); // Call the bubbleSort method to sort the array

        System.out.println("Sorted array:");
        for (int num : arr) { // Loop to print the sorted array
            System.out.print(num + " ");
        }
    }
}



