class Solution {
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

public class p509_FibonacciNum {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(Solution.fib(x));
    }

}
