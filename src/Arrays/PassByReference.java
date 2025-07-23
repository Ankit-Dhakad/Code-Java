package Arrays;
import java.util.Scanner;

public class PassByReference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking the Input of How much size of the array is going to be
        System.out.print("Enter the size of array :- ");
        int n = sc.nextInt();
        //Initialization of an array and giving the size of an array via "n"
        int[] arr = new int[n];

        //asking the user to put "arr" size array
        System.out.println("Enter the array :- ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        changeval(arr);
        PrintArray(arr);
    }
    static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void changeval(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}