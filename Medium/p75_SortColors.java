import java.util.Arrays;

class Solution {
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
    }
}

public class p75_SortColors{
    public static void main(String[] args) {
       int[] nums={2,0,2,1,1,0};
       Solution.sortColors(nums);

    }
}