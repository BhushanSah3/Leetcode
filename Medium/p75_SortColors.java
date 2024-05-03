class Solution {
    public static void sortColors(int[] nums) {
        int mid =0;
        int low = 0;

        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Collections.swap(nums,nums[low],nums[mid]);
                swap(nums, low, mid);
                low++;
                mid++;                         // Dutch national flag algo explanation in copy 
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                // Collections.swap(nums,nums[mid],nums[high]);
                swap(nums, mid, high);
                high--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

public class p75_SortColors {
    public static void main(String[] args) {
       // int[] nums = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0 };
        int[] nums = {2,0,2,1,1,0};
        Solution.sortColors(nums);

    }
}
