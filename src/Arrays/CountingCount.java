//Calculating that How many times "x" came in the array

package Arrays;
import java.util.Scanner;

public class CountingCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking the Input of How much size of the array is going to be
        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();
        //Initialization of an array and giving the size of an array via "n"
        int[] arr = new int[n];

        //asking the user to put "arr" size array
        System.out.println("Enter the array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the x :- ");
        int x = sc.nextInt();

        System.out.println("Count of x is :- " + changeval(arr, x));
    }

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int changeval(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }
}