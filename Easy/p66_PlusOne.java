import java.util.Scanner;

class Solution {
    public static int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        // If we reach here, it means the number was all 9's
        // Create a new array with an additional leading digit 1
        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }
}

public class p66_PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 3, 2, 9};
        //int arr[]={1,2,3};
        // int arr[]={9};

        int[] result = Solution.plusOne(arr);
        
        // Print the resulting digits
        System.out.println("Resulting digits:");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
        
        sc.close();
    }
}
