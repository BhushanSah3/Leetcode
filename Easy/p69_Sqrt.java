class Solution {
    public static int mySqrt(int x) {
        int result = (int) Math.pow(x,0.5);
        return result;
    }
}

public class p69_Sqrt {

    public static void main(String[] args) {
        int x = 4;
        int result = Solution.mySqrt(x);
        System.out.println("The sq root is: " + result);
    }
}
