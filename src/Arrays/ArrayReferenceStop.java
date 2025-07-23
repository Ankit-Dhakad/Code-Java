package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReferenceStop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompting the user for array size
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        //Creating an integer array with user-defined size
        int[] arr = new int[n];

        //Asking the user to input array elements
        System.out.print("Enter the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // Filling the array with values from input
        }

        //Printing original array contents
        System.out.print("(Original)Printed array : ");
        PrintArray(arr);

        //Cloning the original array — this creates a separate array in memory
        int[] arr_2 = arr.clone(); /*both line no. 28, 29, 30 creating a separate array in memory and it stops
                                    array referencing*/
        arr_2 = Arrays.copyOf(arr, arr.length);
        arr_2 = Arrays.copyOfRange(arr, 0, arr.length);

        //Printing the cloned array — contents will be identical to original
        System.out.print("Copied array : ");
        PrintArray(arr_2);

        //Modifying cloned array — these changes will NOT affect the original array
        arr_2[0] = 0;
        arr_2[1] = 0;

        //Printing original array — remains unchanged because of deep copy via `.clone()`
        System.out.print("Original array after changing arr _2 : ");
        PrintArray(arr);

        //Printing cloned array — shows changes applied after cloning
        System.out.print("Original array after changing arr_2 : ");
        PrintArray(arr_2);
    }

    //Utility method to print array elements
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Move to next line after printing array
    }
}