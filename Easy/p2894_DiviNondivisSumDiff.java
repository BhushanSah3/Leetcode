import java.util.Scanner;

class Solution {
    public static int differenceOfSums(int n, int m) {
        int divisible=0;
        int nondivisible=0;
        for(int i=1;i<=n;i++){
            
            if(i%m!=0){
            nondivisible = nondivisible+ i;
            //System.out.print("The nums which are not divisible by "+m + "are" +i);
         //   System.out.println();
            }
            else {
                divisible =divisible+ i;
            //  System.out.print("The nums which are  divisible by "+m + "are" +i);
            //System.out.println();
            }
        }
        System.out.println();
        System.out.println("the nondivisible sum is :"+nondivisible);
        System.out.println("the divisible is "+ divisible);

       int  diff= nondivisible - divisible;
        return diff;
    }
}

public class p2894_DiviNondivisSumDiff {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

     System.out.println("enter n:");
     int n=sc.nextInt();
     System.out.println("enter m:");
     int m=sc.nextInt();

    int Difference=Solution.differenceOfSums(n,m);
    System.out.println("The difference is :"+Difference);
    sc.close();
    }
}
