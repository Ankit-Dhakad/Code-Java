package Arrays;

import java.util.Scanner;

public class ArrayReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the Input of How much size of the array is going to be
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        //Initialization of an array and giving the size of an array via "n"
        int[] arr = new int[n];

        //asking the user to put "arr" size array
        System.out.print("Enter the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("(Original)Printed array : ");
        PrintArray(arr);
        /* Reference copy: arr_2 now refers to the same array object as arr
        No new array is created here, both variables point to the same memory location
        */
        int[] arr_2 = arr;

        // Print arr_2 — looks identical to arr because they’re just two names for the same array
        System.out.print("Copied array : ");
        PrintArray(arr_2);

        // Change first two elements of arr_2 — this affects arr as well due to shared reference
        arr_2[0] = 0;
        arr_2[1] = 0;

        // Print arr — the changes in arr_2 have impacted arr
        // Demonstrates that both variables share the same array instance
        System.out.print("Original array after changing arr _2 : ");
        PrintArray(arr);

        // Just confirming again that arr_2 reflects the changes (same object as arr)
        System.out.print("Original array after changing arr_2 : ");
        PrintArray(arr_2);
    }
    static void PrintArray(int[] n){
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
}