class Solution {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                // If two consecutive elements are zero
                moveZeroToEnd(nums, i);
                i--; // Revisit the current position as it has been shifted
                n--; // Decrease the array length as we move zeroes to the end
            } else if (nums[i] == 0) {
                // If the current element is zero
                swap(nums, i, i + 1);
            }
        }
        // for (int num : nums) {
        // System.out.print(num + " ");
        // }
    }

    private static void moveZeroToEnd(int[] nums, int start) {
        for (int i = start; i < nums.length - 1; i++) {
            swap(nums, i, i + 1);
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// -------------------------------------------------------------------------------------------

// class Solution {
// public static void moveZeroes(int[] nums) {
// int l = 0;
// for (int r = 0; r < nums.length; r++) {
// if (nums[r] != 0) {
// swap(nums, l, r);
// l++;

// }
// }
// for (int num : nums) {
// System.out.print(num + " ");
// }
// }

// public static void swap(int[] nums, int i, int j) {
// int temp = nums[i];
// nums[i] = nums[j];
// nums[j] = temp;
// }
// }

// -------------------------------------------------------------------------------------------------

// public class p283_MoveZeroes {
// public static void main(String[] args) {
// int [] nums = {4,1,0,3,12};
// //int[] nums = { 0, 1, 0, 3, 12 };
// // int[] nums = {0, 0};
// Solution.moveZeroes(nums);
// }
// }

public class p283_MoveZeroes {
    public static void main(String[] args) {
       // int[] nums = { 4, 1, 0, 3, 12 };
        // int[] nums = { 0, 1, 0, 3, 12 };
         int[] nums = {0, 0};

        // Get the current time before running the code
        long startTime = System.currentTimeMillis();

        // Run the code
        Solution.moveZeroes(nums);
        long endTime = System.currentTimeMillis();
        long runtime = endTime - startTime;

        System.out.println("\nRuntime: " + runtime + " milliseconds");
    }
}
