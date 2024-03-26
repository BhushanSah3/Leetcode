import java.util.Scanner;

class Solution {
    public static void reverseString(char[] s) {
        int right, left, i, j;
        left = 0;
        right = s.length - 1;
        while (left < right) {
           char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for (j = 0; j < s.length; j++) {
            System.out.print(s[j] + " ");
        }

    }
}

public class p344_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        char[] s = new char[size];
        for (int i = 0; i < size; i++) {
            s[i] = sc.next().charAt(0);
        }

        Solution.reverseString(s);
        sc.close();
    }
}