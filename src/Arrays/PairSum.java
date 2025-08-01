//Calculating the Pair sum in the array

package Arrays;

import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the Array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target :- ");
        int target = sc.nextInt();

        System.out.print("sum of pairs : " + pairSum(arr, target));
    }

    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}