class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1, maxLeft = 0, maxRight = 0, water = 0;

        while (l < r) {
            maxLeft = Math.max(maxLeft, height[l]);
            maxRight = Math.max(maxRight, height[r]);

            if (height[l] < height[r]) {
                water += Math.min(maxLeft, maxRight) - height[l];
                l++;
            } else {
                water += Math.min(maxLeft, maxRight) - height[r];
                r--;
            }
        }

        return water;
    }
}