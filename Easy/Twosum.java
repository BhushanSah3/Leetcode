import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("found");
                    System.out.println("Indices with the sum: " + i + ", " + j);

                    return new int[] { i, j }; // If it is, it prints found and returns a new array containing the indices i and j.
                }
            }
        }
        System.out.println("No sum found between the elements.");

        return new int[] { -1, -1 };
    }
}

public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int Size = sc.nextInt();

        int[] nums = new int[Size];

        for (int i = 0; i < Size; i++) {
            System.out.println("enter the numbers:");
            nums[i] = sc.nextInt();
        }
        System.out.println("enter the target number:");
        int target = sc.nextInt();

        Solution.twoSum(nums, target);
        sc.close();
    }
}