// Count the number of elements strictly greater than x

package Arrays;

import java.util.Scanner;
public class strictlyGreatElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the Array :- ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the x :- ");
        int x = sc.nextInt();
        System.out.println("Strictly large numbers are : " + index(arr, x));
    }
    static int index(int[] arr, int x){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }
}
