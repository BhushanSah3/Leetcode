class Solution {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int profit=0;
       int  cp=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<cp){
                cp=prices[i];
            }
            else{
                profit=prices[i]-cp;
            }
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}

public class p121_BestBuySellStock {
    public static void main(String[] args) {
       int[] prices = { 7, 6, 4, 3, 1 };
       // int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(Solution.maxProfit(prices));
    }
}
