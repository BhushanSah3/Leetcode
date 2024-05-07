class Solution {
    public static int reverse(int x) {
        long reve=0;
        while(Math.abs(x)>0){
            int digit=x%10;
            x=x/10;
            reve=reve*10+digit;
        }
        if(reve <Math.pow(2, 31) - 1 && reve > Math.pow(-2, 31)){
            return(int) reve;
        }
        else {
            return 0;
        }
    }
}

public class p7_ReverseInte {
    public static void main(String[] args) {
        int x=1534236469;
        System.out.println(Solution.reverse(x));

    }

}