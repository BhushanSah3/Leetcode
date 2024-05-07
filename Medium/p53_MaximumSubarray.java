class Solution {
    public static int maxSubArray(int[] arr) {
        int curs=arr[0];
        int maxs=arr[0];
        for(int i=1;i<arr.length;i++){
            curs=Math.max(arr[i], curs+arr[i]);
            maxs=Math.max(curs, maxs);
          }
          return maxs;
        }
       
    }

public class p53_MaximumSubarray{
    public static void main(String[] args) {
    //int arr[] = { -2, -3, -4, 4,-1,-2,1,5,-3};
   int arr[] = { -1, -2, -6, -1, -3 };
    //int arr[] = { 2, 4, 6, 8, 10 };
    int x = Solution.maxSubArray(arr);
    System.out.println("max is "+ x);
    }
}