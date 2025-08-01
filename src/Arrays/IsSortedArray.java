// Checking that array is sorted or not sorted

package Arrays;

import java.util.Scanner;
public class IsSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Array :- ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Is Sorted : " + isSorted(arr));
    }
    static boolean isSorted(int[] arr){
        boolean check = true;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
}
