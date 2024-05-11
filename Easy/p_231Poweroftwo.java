class Solution {
    public static  boolean isPowerOfTwo(int n) {
        int oneless = n - 1;
        if(n <= 0){
            return false;
        }
        else  if ((n & oneless) == 0) {
            return true;
        }
        return false;
    }
}

public class p_231Poweroftwo {
    public static void main(String[] args) {
        System.out.println(Solution.isPowerOfTwo(0));
    }
}
