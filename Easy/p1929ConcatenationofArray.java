import java.util.Scanner;

class Solution {
    public static int[] getConcatenation(int[] nums,int size) {
        int[] num2=new int[2*nums.length];
     for(int i=0 ;i<(nums.length);i++){
        num2[i] = nums[i];
        num2[i + nums.length] = nums[i];    //saath saath me two indexes update ho rahe haii using size
     }
    return num2;
    }
}

public class p1929ConcatenationofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array:");

        int nums[] = new int[size]; 

        for(int i=0;i<size;i++){
            nums[i] =sc.nextInt();
        }
      //  System.out.println("the length is" + nums.length);

        int[] result= Solution.getConcatenation(nums,size);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i] +" ");
        }
        sc.close();
    }

}
