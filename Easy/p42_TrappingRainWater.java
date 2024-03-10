class Solution {
    // If there is only single bar and only two bar. And if the bars are in
    // ascending order or in descending order,
    // then. the amount of water to be trapped will be 0.
    public static void trap(int[] harr) {
        int width = 1;
        int wl;
        int maxleft[] = new int[harr.length];
        int maxright[] = new int[harr.length];

        // calculate maxleft
        maxleft[0] = harr[0];
        for (int i = 1; i < maxleft.length; i++) {
            maxleft[i] = Math.max(maxleft[i - 1], harr[i]);
        }

        // calculate maxright  means tum right direction se left mejaate hue max bar height kitna haii
        maxright[harr.length - 1] = harr[harr.length - 1];
        for (int i = harr.length - 2; i >= 0; i--) {
            maxright[i] = Math.max(maxright[i + 1], harr[i]);
        } // i+1 compares one ahead and with itself

        int trappedwater = 0;
        for (int i = 0; i < harr.length; i++) {
            wl = Math.min(maxleft[i], maxright[i]);
            // why we take here min bcoz there will be only the amount of water stored with
            // respective to the minimum height of the boundary bars
            trappedwater += (wl - harr[i]) * width;
        }
        System.out.println("trapped water total is " + trappedwater);

    }
}

public class p42_TrappingRainWater {
    public static void main(String args[]) {
        // int harr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        // int harr[] = { 4, 2, 0, 3, 2, 5 };
        int harr[] = { 4, 2, 0, 6, 3, 2, 5 };

        Solution.trap(harr);
    }
}