import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        while (left <= right) {
            int x = left;
            boolean isSelfDividing = true;
            while (x > 0) {
                int second = x % 10;
                if (second == 0 || left % second != 0) {
                    isSelfDividing = false;
                    break;
                }
                x = x / 10;
            }
            if (isSelfDividing) {
                result.add(left);
            }
            left++;
        }
        return result;
    }
}

public class p728_SelfDividingNum {
    public static void main(String[] args) {
        List<Integer> result = Solution.selfDividingNumbers(1, 22);
        System.out.println("Self-dividing numbers: " + result);
    }
}
