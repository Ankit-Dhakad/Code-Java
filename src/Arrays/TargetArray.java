package Arrays;

import java.util.*;

public class Trash {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Insert nums[i] at index[i]
            target.add(index[i], nums[i]);
        }

        // Convert List to array
        int[] result = new int[target.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = target.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] target = createTargetArray(nums, index);

        System.out.println(Arrays.toString(target));
    }
}