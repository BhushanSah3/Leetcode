class Solution {
    public  static int singleNumber(int[] nums) {
        int xor =0;
        for(int i=0; i<nums.length;i++){
            xor= xor ^ nums[i];

        }
        return xor;
    }
}
public class P136_SingleNumber {
   

    public static void main(String[] args) {
     //   int nums[] = { 2, 2, 1 };
         int nums[]={4,1,2,1,2};
        System.out.println(Solution.singleNumber(nums));
    }
}
