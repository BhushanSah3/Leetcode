import java.util.*;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x/10;

            reversed = reversed * 10 + digit;
            //in case of 121 reversed is 1 then 12 then 121. goes multiplied by 10
        }
        return original == reversed;
    }
}

public class p9_PalindromeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int num = scanner.nextInt();

        boolean result = Solution.isPalindrome(num);

        if (result) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        scanner.close();
    }
}